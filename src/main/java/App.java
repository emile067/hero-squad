import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");
        get("/hero/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Squad> squads= Squad.getSquadsList();
            model.put("squads",squads);
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/hero", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String heroName = req.queryParams("heroName");
            String age = req.queryParams("heroAge");
            String power = req.queryParams("heroPower");
            String weakness = req.queryParams("heroWeakness");
            int squadIndex = Integer.parseInt(req.queryParams("heroSquad"));
            String squad = Squad.findById(squadIndex).getSquadName();
            Hero newHero = new Hero(heroName,age,power,weakness,squad);
            Squad.findById(squadIndex).addHero(newHero);
            res.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());

        post("/squad", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String name = req.queryParams("squadName");
            String cause = req.queryParams("squadCause");
            int size = Integer.parseInt(req.queryParams("squadSize"));
            Squad newSquad= new Squad(size,name,cause);
            res.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());

        get("/",(req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Squad> squads = Squad.getSquadsList();
            List<Hero> heroes = Hero.getHeroesList();
            model.put("squads",squads);
            model.put("heroes",heroes);
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

        get("/squads/:id", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int indexToFind = Integer.parseInt(req.params("id"));
            Squad foundSquad = Squad.findById(indexToFind);
            model.put("squad",foundSquad);
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());
    }

}

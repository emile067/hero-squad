import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/hero/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Squad> squads= Squad.getSquadsList();
            model.put("squads",squads);
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/hero", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String heroName = req.queryParams("heroName");
            String age = req.queryParams("heroAge");
            String power = req.queryParams("heroPower");
            String weakness = req.queryParams("heroWeakness");
            Hero newHero = new Hero(heroName,age,power,weakness);
//            Squad newSquad = Squad.find();
            res.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());

        get("/",(req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Hero> heroes = Hero.getHeroesList();
            model.put("heroes",heroes);
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

    }

}

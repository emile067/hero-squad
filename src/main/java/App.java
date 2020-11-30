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

        get("/",(req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Hero> heroes = Hero.getHeroesList();
            model.put("heroes",heroes);
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

    }

}

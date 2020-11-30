import java.util.ArrayList;
import java.util.List;

public class Hero {
    public Hero(String heroName, String heroAge, String heroPower, String heroWeakness, String heroSquad) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.heroPower = heroPower;
        this.heroWeakness = heroWeakness;
        this.heroSquad = heroSquad;
        this.heroesList.add(this);
    }

    public String getHeroName() {
        return heroName;
    }

    public String getHeroAge() {
        return heroAge;
    }

    public String getHeroPower() {
        return heroPower;
    }

    public String getHeroWeakness() {
        return heroWeakness;
    }

    public String getHeroSquad() {
        return heroSquad;
    }

    public static List<Hero> getHeroesList() {
        return heroesList;
    }

    private String heroName;
    private String heroAge;
    private String heroPower;
    private String heroWeakness;
    private String heroSquad;
    private static List<Hero> heroesList = new ArrayList<Hero>();


}

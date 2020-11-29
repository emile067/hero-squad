import java.util.ArrayList;
import java.util.List;

public class Hero {
    public Hero(String heroName, String heroAge, String heroPower, String heroWeakness) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.heroPower = heroPower;
        this.heroWeakness = heroWeakness;
        this.heroesList.add(this);
    }

    private String heroName;
    private String heroAge;
    private String heroPower;
    private String heroWeakness;
    private static List<Hero> heroesList = new ArrayList<Hero>();


}

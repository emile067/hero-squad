import java.util.ArrayList;
import java.util.List;

public class Squad {
    public Squad(int maxSize, String squadName, String squadCause) {
        this.maxSize = maxSize;
        this.squadName = squadName;
        this.squadCause = squadCause;
        this.squadSize = 0;
        this.squadsList.add(this);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getSquadName() {
        return squadName;
    }

    public String getSquadCause() {
        return squadCause;
    }

    public List<Hero> getSquadHeroes() {
        return this.squadHeroes;
    }

    public static List<Squad> getSquadsList() {
        return squadsList;
    }

    private int maxSize;
    private int squadSize;
    private String squadName;
    private String squadCause;
    private List<Hero> squadHeroes = new ArrayList<Hero>();
    private static List<Squad> squadsList = new ArrayList<Squad>();

    public void addHero(Hero newHero){
        this.squadHeroes.add(newHero);
        this.squadSize=+1;
    }
}

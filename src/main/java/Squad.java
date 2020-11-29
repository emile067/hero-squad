import java.util.ArrayList;
import java.util.List;

public class Squad {
    public Squad(int maxSize, String squadName, String squadCause) {
        this.maxSize = maxSize;
        this.squadName = squadName;
        this.squadCause = squadCause;
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

    public static List<Hero> getSquadHeroes() {
        return squadHeroes;
    }

    public static List<Squad> getSquadsList() {
        return squadsList;
    }

    private int maxSize;
    private String squadName;
    private String squadCause;
    private static List<Hero> squadHeroes = new ArrayList<Hero>();
    private static List<Squad> squadsList = new ArrayList<Squad>();
}

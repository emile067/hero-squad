import java.util.ArrayList;
import java.util.List;

public class Squad {
    public Squad(int maxSize, String squadName, String squadCause) {
        this.maxSize = maxSize;
        this.squadName = squadName;
        this.squadCause = squadCause;
        this.squadSize = 0;
        this.squadsList.add(this);
        this.id = squadsList.size();
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

    public int getSquadSize() {
        return squadSize;
    }

    private int squadSize;

    public int getId() {
        return id;
    }

    private int id;
    private String squadName;
    private String squadCause;
    private List<Hero> squadHeroes = new ArrayList<Hero>();
    private static List<Squad> squadsList = new ArrayList<Squad>();

    public void addHero(Hero newHero){
        this.squadHeroes.add(newHero);
        this.squadSize= this.squadSize+1;
    }

    public void clearHeroes(){
        this.squadHeroes.clear();
    }

    public static void clearSquads(){
        squadsList.clear();
    }

    public static Squad find(String name) {
        Integer index = null;
        for (Squad squad : squadsList) {
            if (squad.squadName == name) {
                index = getSquadsList().indexOf(squad);
                break;
            }
        }
        return squadsList.get(index);
    }

    public static Squad findById(int id){
        return squadsList.get(id-1);
    }
}

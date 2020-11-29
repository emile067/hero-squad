import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newHeroIsCreated_true(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        assertTrue(newSquad instanceof Squad);
    }

    @Test
    public void newSquadHasAllAttributes(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        Hero newHero = new Hero("emile","18", "Coding", "Sleeping:)");
        newSquad.getSquadHeroes().add(newHero);
        assertEquals(4,newSquad.getMaxSize());
        assertEquals("Marines",newSquad.getSquadName());
        assertEquals("Coding to another level",newSquad.getSquadCause());
        assertTrue(newSquad.getSquadHeroes().contains(newHero));
    }

    @Test
    public void returnAllSquads(){
        Squad firstSquad = new Squad(3,"marines","coding");
        Squad secondSquad = new Squad(4,"Marines","Coding");
        assertTrue(Squad.getSquadsList().contains(firstSquad));
        assertTrue(Squad.getSquadsList().contains(secondSquad));
    }

    @Test
    public void addHeroesToSquadWithAddHero(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        Hero firstHero = new Hero("emile","18", "Coding", "Sleeping:)");
        Hero secondHero = new Hero("kamana","18", "Strength", "Patience");
        newSquad.addHero(firstHero);
        newSquad.addHero(secondHero);
        assertTrue(newSquad.getSquadHeroes().contains(firstHero));
        assertTrue(newSquad.getSquadHeroes().contains(secondHero));
    }

    @Test
    public void addHeroIncrementsSize(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        Hero firstHero = new Hero("emile","18", "Coding", "Sleeping:)");
        Hero secondHero = new Hero("kamana","18", "Strength", "Patience");
        newSquad.addHero(firstHero);
        int initialSize = newSquad.getSquadSize();
        newSquad.addHero(secondHero);
        assertEquals(initialSize+1,newSquad.getSquadSize());
    }
}
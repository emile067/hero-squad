import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newSquadIsCreated_true(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        assertTrue(newSquad instanceof Squad);
    }

    @Test
    public void newSquadHasAllAttributes(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        Hero newHero = new Hero("emile","18", "Coding", "Sleeping:)","marines");
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
        Hero firstHero = new Hero("emile","18", "Coding", "Sleeping:)","marines");
        Hero secondHero = new Hero("kamana","18", "Strength", "Patience","marines");
        newSquad.addHero(firstHero);
        newSquad.addHero(secondHero);
        assertTrue(newSquad.getSquadHeroes().contains(firstHero));
        assertTrue(newSquad.getSquadHeroes().contains(secondHero));
    }

    @Test
    public void addHeroIncrementsSize(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        Hero firstHero = new Hero("emile","18", "Coding", "Sleeping:)","marines");
        Hero secondHero = new Hero("kamana","18", "Strength", "Patience","marines");
        newSquad.addHero(firstHero);
        int initialSize = newSquad.getSquadSize();
        newSquad.addHero(secondHero);
        assertEquals(initialSize+1,newSquad.getSquadSize());
    }

    @Test
    public void ClearHeroes_true(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        Hero firstHero = new Hero("emile","18", "Coding", "Sleeping:)","marines");
        Hero secondHero = new Hero("kamana","18", "Strength", "Patience","marines");
        newSquad.addHero(firstHero);
        newSquad.addHero(secondHero);
        newSquad.clearHeroes();
        assertTrue(newSquad.getSquadHeroes().isEmpty());
    }

    @Test
    public void clearSquads_true(){
        Squad firstSquad = new Squad(3,"marines","coding");
        Squad secondSquad = new Squad(4,"Marines","Coding");
        assertFalse(Squad.getSquadsList().isEmpty());
        Squad.clearSquads();
        assertTrue(Squad.getSquadsList().isEmpty());
    }

    @Test
    public void findSquadByName(){
        Squad firstSquad = new Squad(3,"marines","coding");
        Squad secondSquad = new Squad(4,"Marine","Coding");
        Squad foundSquad= Squad.find("marines");
        assertEquals(firstSquad,foundSquad);
        assertEquals(secondSquad,Squad.find("Marine"));
    }

    @Test
    public void findSquadById(){
        Squad firstSquad = new Squad(3,"marines","coding");
        Squad secondSquad = new Squad(4,"Marine","Coding");
        int idToFind= firstSquad.getId();
        System.out.println(idToFind);
        Squad foundSquad= Squad.findById(idToFind);
        assertEquals(firstSquad,foundSquad);
    }
}
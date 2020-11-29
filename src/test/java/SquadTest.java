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
}
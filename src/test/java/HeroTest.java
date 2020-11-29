import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void newHeroIsCreated_true(){
        Hero newHero = new Hero("emile","18", "Coding", "Sleeping:)");
        assertTrue(newHero instanceof Hero);
    }

    @Test
    public void newHeroHasAllAttributes(){
        Hero newHero = new Hero("emile","18", "Coding", "Sleeping:)");
        assertEquals("emile",newHero.getHeroName());
        assertEquals("18",newHero.getHeroAge());
        assertEquals("Coding",newHero.getHeroPower());
        assertEquals("Sleeping:)",newHero.getHeroWeakness());
    }


}
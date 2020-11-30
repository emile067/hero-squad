import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void newHeroIsCreated_true(){
        Hero newHero = new Hero("emile","18", "Coding", "Sleeping:)","marines");
        assertTrue(newHero instanceof Hero);
    }

    @Test
    public void newHeroHasAllAttributes(){
        Hero newHero = new Hero("emile","18", "Coding", "Sleeping:)","marines");
        assertEquals("emile",newHero.getHeroName());
        assertEquals("18",newHero.getHeroAge());
        assertEquals("Coding",newHero.getHeroPower());
        assertEquals("Sleeping:)",newHero.getHeroWeakness());
    }

    @Test
    public void returnAllHeroesWithGetHeroes_true(){
        Hero firstHero = new Hero("emile","18", "Coding", "Sleeping:)","marines");
        Hero secondHero = new Hero("kamana","18", "Strength", "Patience","marines");
        assertTrue(Hero.getHeroesList().contains(firstHero));
        assertTrue(Hero.getHeroesList().contains(secondHero));
    }
}
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void newHeroIsCreated_true(){
        Hero newHero = new Hero("emile","18", "Coding", "Sleeping:)");
        assertTrue(newHero instanceof Hero);
    }
}
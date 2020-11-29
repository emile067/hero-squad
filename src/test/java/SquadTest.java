import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newHeroIsCreated_true(){
        Squad newSquad = new Squad(4,"Marines", "Coding to another level");
        assertTrue(newSquad instanceof Squad);
    }
}
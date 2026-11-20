package io.studentlaptop.monsters.monster.move;

import org.junit.jupiter.api.Test;

import static io.studentlaptop.monsters.monster.move.MoveInfo.*;
import static org.junit.jupiter.api.Assertions.*;

public class MoveTests {
    @Test
    public void givenMove_whenPpUpCounterIsIncrementedThreeTimes_thenPpUpCounterEqualsThree(){
        Move absorb = new Move(ABSORB);
        for (int i = 0; i < 3; i++) {
            absorb.incrementPpUpCounter();
        }

        assertEquals(3, absorb.getPpUpCounter());
        assertFalse(absorb.incrementPpUpCounter());

    }

    @Test
    public void givenMove_whenPpUpCounterIsIncrementedThreeTimes_thenPpEqualsMax(){
        Move absorb = new Move(ABSORB);
        for (int i = 0; i < 3; i++) {
            absorb.incrementPpUpCounter();
        }

        assertNotEquals(absorb.getInfo().getPowerPoints(), absorb.getMaxPowerPoints());
        assertEquals(absorb.getInfo().getPowerPoints() * 8/5, absorb.getMaxPowerPoints());
        assertFalse(absorb.setPpToMax());
    }
}

package io.studentlaptop.monsters.monster.move;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveSetTests {
    @Test
    public void constructMoveSetWithBuilder() {
        MoveSet builderMoveSet = new MoveSet.Builder(MoveInfo.DOUBLE_KICK).second(MoveInfo.SLAM).build();

        assertSame(MoveInfo.DOUBLE_KICK, builderMoveSet.getFirst().getInfo());
        assertSame(MoveInfo.SLAM, builderMoveSet.getSecond().getInfo());

        assertNull(builderMoveSet.getThird());
        assertNull(builderMoveSet.getFourth());

        assertEquals(4, builderMoveSet.size());
    }

    @Test
    public void noDuplicatesInMoveSet() {
        assertThrows(IllegalArgumentException.class, () -> new MoveSet.Builder(MoveInfo.DOUBLE_KICK).second(MoveInfo.DOUBLE_KICK).build());
    }
}

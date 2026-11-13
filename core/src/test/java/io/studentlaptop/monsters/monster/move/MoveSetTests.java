package io.studentlaptop.monsters.monster.move;

import org.junit.jupiter.api.Test;

import java.util.List;

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
        MoveSet emptyMoveSet = new MoveSet();
        MoveSet tackle = new MoveSet.Builder(MoveInfo.TACKLE).build();
        Move[] moves = {MoveInfo.TACKLE.create()};
        assertThrows(IllegalArgumentException.class, () -> new MoveSet.Builder(MoveInfo.DOUBLE_KICK).second(MoveInfo.DOUBLE_KICK).build());
        assertDoesNotThrow(() -> new MoveSet(List.of(moves)));
    }

    @Test
    public void indexOfAndContains() {
        MoveSet emptyMoveSet = new MoveSet();
        MoveSet tackleMoveSet = new MoveSet.Builder(MoveInfo.TACKLE).build();
        assertDoesNotThrow(() -> emptyMoveSet.indexOf(null));
        assertNotEquals(-1, emptyMoveSet.indexOf(null));
        assertTrue(emptyMoveSet.contains(null));
        assertThrows(ClassCastException.class, () -> emptyMoveSet.indexOf("null"));
        assertNotEquals(-1, tackleMoveSet.indexOf(MoveInfo.TACKLE));
    }
}

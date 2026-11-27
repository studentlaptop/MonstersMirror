package io.studentlaptop.monsters.monster.move;

import io.studentlaptop.monsters.monster.moveset.Moveset;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovesetTests {
    @Test
    public void constructMoveSetWithBuilder() {
        Moveset builderMoveset = new Moveset.Builder(MoveInfo.DOUBLE_KICK).second(MoveInfo.SLAM).build();

        assertSame(MoveInfo.DOUBLE_KICK, builderMoveset.getFirst().getInfo());
        assertSame(MoveInfo.SLAM, builderMoveset.getSecond().getInfo());

        assertNull(builderMoveset.getThird());
        assertNull(builderMoveset.getFourth());

        assertEquals(Moveset.REQ_LENGTH, builderMoveset.size());
    }

    @Test
    public void noDuplicatesInMoveSet() {
        Moveset emptyMoveset = new Moveset();
        Moveset tackle = new Moveset.Builder(MoveInfo.TACKLE).build();
        Move[] moves = {new Move(MoveInfo.TACKLE)};
        assertThrows(IllegalArgumentException.class, () -> new Moveset.Builder(MoveInfo.DOUBLE_KICK).second(MoveInfo.DOUBLE_KICK).build());
        assertDoesNotThrow(() -> new Moveset(List.of(moves)));
    }

    @Test
    public void indexOfAndContains() {
        Moveset emptyMoveset = new Moveset();
        Moveset tackleMoveset = new Moveset.Builder(MoveInfo.TACKLE).build();
        assertDoesNotThrow(() -> emptyMoveset.indexOf(null));
        assertNotEquals(-1, emptyMoveset.indexOf(null));
        assertTrue(emptyMoveset.contains(null));
        assertThrows(ClassCastException.class, () -> emptyMoveset.indexOf("null"));
        assertNotEquals(-1, tackleMoveset.indexOf(MoveInfo.TACKLE));
    }
}

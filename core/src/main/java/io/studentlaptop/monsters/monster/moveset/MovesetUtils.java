package io.studentlaptop.monsters.monster.moveset;

import io.studentlaptop.monsters.interfaces.ValidateLength;
import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.move.MoveInfo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MovesetUtils {
    static ValidateLength<Move> length = (c, length) -> {
        if (c.size() > length) {
            throw new IllegalArgumentException("Moveset length out of range");
        }
    };

    public static void validateNoDuplicates(Collection<Move> c) {
        Set<MoveInfo> duplicateCheck = new HashSet<>();
        for (Move move : c) {
            if (move == null) {
                continue;
            }
            if (!duplicateCheck.add(move.getInfo())) {
                throw new IllegalArgumentException("Duplicate move: " + move.getName());
            }
        }
    }
}

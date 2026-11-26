package io.studentlaptop.monsters.player.party;

import io.studentlaptop.monsters.interfaces.ValidateLength;
import io.studentlaptop.monsters.monster.Monster;

public class PartyUtils {
    static ValidateLength<Monster> length = (c, length) -> {
        if (c.size() > length) {
            throw new IllegalArgumentException("Party length out of range");
        }
    };
}

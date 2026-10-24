package io.studentlaptop.monsters.monster.status.statuses;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.status.Status;

public class Confusion extends Status {
    private static final String NAME = "Confusion";

    Confusion() {
        super();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void behavior(Monster monster) {
        int recoverChance = recoverChance(1, 3);

        if (recoverChance == 3) {
            monster.setStatus(null);
        }
        monster.setHealth(monster.getHealth() / 6);
    }
}

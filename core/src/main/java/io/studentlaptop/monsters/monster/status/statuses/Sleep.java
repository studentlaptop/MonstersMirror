package io.studentlaptop.monsters.monster.status.statuses;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.status.Status;

public class Sleep extends Status {
    private static final String NAME = "Sleep";

    Sleep() {
        super();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void behavior(Monster monster) {
        int wakeChance = recoverChance(1, 3);

        if (wakeChance == 3) {
            monster.setStatus(null);
        }
    }
}

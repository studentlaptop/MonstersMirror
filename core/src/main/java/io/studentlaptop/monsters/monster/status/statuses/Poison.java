package io.studentlaptop.monsters.monster.status.statuses;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.status.Status;

public class Poison extends Status {
    private static final String NAME = "Poison";

    Poison() {
        super();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void behavior(Monster monster) {
        monster.setHealth((monster.getHealth() / 8));
    }
}

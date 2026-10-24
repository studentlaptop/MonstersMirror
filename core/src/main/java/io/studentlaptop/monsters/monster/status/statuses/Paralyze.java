package io.studentlaptop.monsters.monster.status.statuses;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.status.Status;

import java.util.random.RandomGenerator;

public class Paralyze extends Status {
    private static final String NAME = "Paralyze";

    Paralyze() {
        super();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void behavior(Monster monster) {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        int moveChance = rng.nextInt(1, 3);

        if (moveChance == 3) {
            monster.setStatus(null);
        }
    }
}

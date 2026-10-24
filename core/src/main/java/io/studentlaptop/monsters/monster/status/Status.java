package io.studentlaptop.monsters.monster.status;

import io.studentlaptop.monsters.monster.Monster;

import java.util.random.RandomGenerator;

public abstract class Status {

    protected Status() {

    }

    public abstract String getName();

    public int recoverChance(int origin, int bound) {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        return rng.nextInt(origin, bound);
    }

    public abstract void behavior(Monster monster);
}

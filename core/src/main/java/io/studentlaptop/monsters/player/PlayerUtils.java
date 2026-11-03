package io.studentlaptop.monsters.player;

import java.util.random.RandomGenerator;

class PlayerUtils {
    private static int getRandomID() {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        return rng.nextInt(rng.nextInt(0, Integer.MAX_VALUE));
    }

    static int getTrainerID() {
        return getRandomID();
    }

    static int getSecretID() {
        return getRandomID();
    }
}

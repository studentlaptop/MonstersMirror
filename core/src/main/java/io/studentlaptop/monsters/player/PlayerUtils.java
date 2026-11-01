package io.studentlaptop.monsters.player;

import java.util.HashSet;
import java.util.Set;
import java.util.random.RandomGenerator;

class PlayerUtils {
    static int[] IDs = getRandomIDs();

    private static int[] getRandomIDs() {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        Set<Integer> uniqueIDs = new HashSet<>();

        while (uniqueIDs.size() < 2) {
            uniqueIDs.add(rng.nextInt(0, Integer.MAX_VALUE));
        }

        int[] IDs = new int[uniqueIDs.size()];

        int i = 0;
        for (Integer uniqueID : uniqueIDs) {
            IDs[i] = uniqueID;
            i++;
        }
        return IDs;
    }

    static int getTrainerID() {
        return IDs[0];
    }

    static int getSecretID() {
        return IDs[1];
    }
}

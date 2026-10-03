package monster.move.interfaces;

import monster.Monster;

import java.util.random.RandomGenerator;

public interface Status {
    default int statusChance(int origin, int bound) {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        return rng.nextInt(origin, bound);
    }

    default boolean isUnaffected(Monster monster) {
        return monster.getStatus() == null;
    }

    boolean inflictStatus(Monster monster);
    int getPowerPoints();
    void setPowerPoints(int powerPoints);
}

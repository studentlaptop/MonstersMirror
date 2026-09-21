package monster.status;

import monster.Monster;

import java.util.random.RandomGenerator;

public abstract class Status {
    private String name;

    public Status() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int recoverChance(int origin, int bound) {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        return rng.nextInt(origin, bound);
    }

    public abstract void behavior(Monster monster);

    public String toString() {
        return name;
    }
}

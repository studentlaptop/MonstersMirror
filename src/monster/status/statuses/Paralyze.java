package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

import java.util.random.RandomGenerator;

public class Paralyze extends Status {
    private Paralyze() {
        super();
        setName("Paralyze");
    }

    @Override
    public void behavior(Monster monster) {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        int moveChance = rng.nextInt(1, 3);

        if (moveChance == 3) {
            monster.setStatus(null);
        }
    }

    private static class ParalyzeInstance {
        private static final Paralyze instance = new Paralyze();
    }

    public static Paralyze getInstance()
    {
        return ParalyzeInstance.instance;
    }
}

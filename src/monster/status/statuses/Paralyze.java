package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

import java.util.random.RandomGenerator;

public class Paralyze extends Status {
    public Paralyze() {
        super();
        setName("Paralyze");
    }

    @Override
    public void behavior(Monster monster) {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        int moveChance = rng.nextInt(1, 3);

        if (moveChance == 3) {
            //
            ;
        }
    }
}

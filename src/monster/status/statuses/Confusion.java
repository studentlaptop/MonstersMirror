package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Confusion extends Status {
    private Confusion() {
        super();
        setName("Confusion");
    }

    @Override
    public void behavior(Monster monster) {
        int recoverChance = recoverChance(1, 3);

        if (recoverChance == 3) {
            monster.setStatus(null);
        }
        monster.setHealth(monster.getHealth() / 6);
    }

    private static class ConfusionInstance {
        private static final Confusion instance = new Confusion();
    }

    public static Confusion getInstance() {
        return ConfusionInstance.instance;
    }
}

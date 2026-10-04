package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Burn extends Status {
    private static final String NAME = "Burn";

    Burn() {
        super();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void behavior(Monster monster) {
        monster.setHealth(monster.getHealth() / 6);
    }
}

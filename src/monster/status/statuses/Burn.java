package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Burn extends Status {
    private Burn() {
        super();
        setName("Burn");
    }

    @Override
    public void behavior(Monster monster) {
        monster.setHealth(monster.getHealth() / 6);
    }

    private static class BurnInstance {
        private static final Burn instance = new Burn();
    }

    public static Burn getInstance() {
        return BurnInstance.instance;
    }
}

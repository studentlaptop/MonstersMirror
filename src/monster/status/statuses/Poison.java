package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Poison extends Status {
    private Poison() {
        super();
        setName("Poison");
    }

    @Override
    public void behavior(Monster monster) {
        monster.setHealth((monster.getHealth() / 8));
    }

    private static class PoisonInstance {
        private static final Poison instance = new Poison();
    }

    public static Poison getInstance(){
        return PoisonInstance.instance;
    }
}

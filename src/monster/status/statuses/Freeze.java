package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Freeze extends Status {
    private Freeze() {
        super();
        setName("Freeze");
    }

    @Override
    public void behavior(Monster monster) {
        monster.setHealth(monster.getHealth() / 3);
    }

    private static class FreezeInstance {
        private static final Freeze instance = new Freeze();
    }

    public static Freeze getInstance() {
        return FreezeInstance.instance;
    }
}

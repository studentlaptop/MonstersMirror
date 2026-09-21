package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Freeze extends Status {
    public Freeze() {
        super();
        setName("Freeze");
    }

    @Override
    public void behavior(Monster monster) {
        monster.setHealth(monster.getHealth() / 3);
    }
}

package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Burn extends Status {
    public Burn() {
        super();
        setName("Burn");
    }

    @Override
    public void behavior(Monster monster) {
        monster.setHealth(monster.getHealth() / 6);
    }
}

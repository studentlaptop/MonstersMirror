package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Poison extends Status {
    private int turnCounter;

    public Poison() {
        super();
        setName("Poison");
        turnCounter = 1;
    }

    @Override
    public void behavior(Monster monster) {
        monster.setHealth((monster.getHealth() / 8) * turnCounter);
        turnCounter++;
    }
}

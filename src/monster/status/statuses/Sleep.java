package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Sleep extends Status {
    public Sleep() {
        super();
        setName("Sleep");
    }

    @Override
    public void behavior(Monster monster) {
        int wakeChance = recoverChance(1, 3);

        if (wakeChance == 3) {
            monster.setStatus(null);
        }
    }
}

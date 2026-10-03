package monster.status.statuses;

import monster.Monster;
import monster.status.Status;

public class Sleep extends Status {
    private Sleep() {
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

    private static class SleepInstance{
        private static final Sleep instance = new Sleep();
    }

    public static Sleep getInstance(){
        return SleepInstance.instance;
    }
}

package monster.move.moves.support;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Heal;

public class SoftBoiled extends Move implements Heal {
    private SoftBoiled() {
        super();
        setName("Soft-Boiled");
        setType(Type.NORMAL);
        setAccuracy(100);
        setPowerPoints(25);
    }

    public void heal(Monster user) {
        user.setHealth(user.getHealth() + (user.getHealth() / 2));
    }

    private static class SoftBoiledInstance {
        private static final SoftBoiled instance = new SoftBoiled();
    }

    public static SoftBoiled getInstance() {
        return SoftBoiledInstance.instance;
    }
}

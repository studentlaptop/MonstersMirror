package monster.move.moves.support;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Heal;

public class SoftBoiled extends Move implements Heal {

    public SoftBoiled() {
        super();
        setName("Soft-Boiled");
        setType(Type.NORMAL);
        setAccuracy(100);
        setPowerPoints(25);
    }

    public SoftBoiled(String name, Type type, int powerPoints) {
        super(name, type, powerPoints);
    }

    public void heal(Monster user) {
        user.setHealth(user.getHealth() + (user.getHealth() / 2));
    }
}

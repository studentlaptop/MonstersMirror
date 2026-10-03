package monster.move.moves.support;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Heal;

public class SoftBoiled extends Move implements Heal {
    private static final String NAME = "Soft-Boiled";
    private static final Type TYPE = Type.NORMAL;
    private int powerPoints;

    SoftBoiled() {
        super();
        setPowerPoints(25);
    }

    public void heal(Monster user) {
        user.setHealth(user.getHealth() + (user.getHealth() / 2));
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Type getType() {
        return TYPE;
    }

    @Override
    public int getAccuracy() {
        return 0;
    }

    @Override
    public int getPowerPoints() {
        return powerPoints;
    }

    @Override
    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

}

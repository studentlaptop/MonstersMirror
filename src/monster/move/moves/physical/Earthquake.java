package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class Earthquake extends Move implements Attack {
    private static final String NAME = "Earthquake";
    private static final Type TYPE = Type.GROUND;
    private static final int ACCURACY = 80;
    private int powerPoints;

    Earthquake() {
        super();
        setPowerPoints(25);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
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
        return ACCURACY;
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

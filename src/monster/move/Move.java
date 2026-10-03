package monster.move;

import monster.Type;

public abstract class Move {
    /*private String name;
    private Type type;
    private int accuracy;
    private int powerPoints;*/

    protected Move() {}

    public abstract String getName();
    public abstract Type getType();
    public abstract int getAccuracy();
    public abstract int getPowerPoints();
    public abstract void setPowerPoints(int powerPoints);
}
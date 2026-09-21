package monster.move;

import monster.Type;

public abstract class Move {
    private String name;
    private Type type;
    private int accuracy;
    private int powerPoints;

    public Move() {

    }

    public Move(String name, Type type, int powerPoints) {
        this.name = name;
        this.type = type;
        this.powerPoints = powerPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }
}
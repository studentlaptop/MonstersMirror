package io.studentlaptop.monsters.monster.move;

import io.studentlaptop.monsters.monster.Type;

public class Move {
    private final String name;
    private final Type type;
    private final int accuracy;
    private final MoveInfo info;
    private int powerPoints;

    public Move(MoveInfo info) {
        this.info = info;
        this.name = info.toString();
        this.type = info.getType();
        this.accuracy = info.getAccuracy();
        this.powerPoints = info.getPowerPoints();
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public MoveInfo getInfo() {
        return info;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        if (powerPoints < 0) {
            this.powerPoints = 0;
        }
        this.powerPoints = powerPoints;
    }

}

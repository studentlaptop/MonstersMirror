package io.studentlaptop.monsters.monster.move;

import io.studentlaptop.monsters.monster.Type;

public class Move {
    public static final int PP_MAX = 3;
    private final MoveInfo info;
    private int powerPoints;
    private int maxPowerPoints;
    private int ppUpCounter;

    public Move(MoveInfo info) {
        this.info = info;
        powerPoints = info.getPowerPoints();
        maxPowerPoints = powerPoints;
        ppUpCounter = 0;
    }

    public String getName() {
        return info.toString();
    }

    public Type getType() {
        return info.type;
    }

    public int getAccuracy() {
        return info.getAccuracy();
    }

    public MoveInfo getInfo() {
        return info;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public int setPowerPoints(int powerPoints) {
        if (powerPoints < 0) {
            return this.powerPoints = 0;
        }
        if (powerPoints <= maxPowerPoints) {
            return this.powerPoints = powerPoints;
        }
        return this.powerPoints = maxPowerPoints;
    }

    public int getMaxPowerPoints() {
        return maxPowerPoints;
    }

    public int getPpUpCounter() {
        return ppUpCounter;
    }

    public boolean incrementPpUpCounter() {
        if (ppUpCounter < PP_MAX) {
            ppUpCounter++;
            maxPowerPoints +=  info.getPowerPoints() / 5;
            return true;
        }
        return false;
    }

    public boolean isPpMaxed() {
        return ppUpCounter == PP_MAX;
    }

    public boolean setPpToMax() {
        if (ppUpCounter != PP_MAX) {
            maxPowerPoints = info.getPowerPoints() * 8/5;
            return true;
        }
        return false;
    }
}

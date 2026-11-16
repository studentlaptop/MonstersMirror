package io.studentlaptop.monsters.monster.move;

import io.studentlaptop.monsters.monster.Type;

public class Move {
    private final MoveInfo info;
    private int powerPoints;
    private int maxPowerPoints;
    private int ppUpCounter;
    private boolean ppMax;

    Move(MoveInfo info) {
        this.info = info;
        powerPoints = info.getPowerPoints();
        maxPowerPoints = powerPoints;
        ppUpCounter = 0;
        ppMax = false;
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
        if (ppUpCounter < 3 && !ppMax) {
            ppUpCounter++;
            maxPowerPoints = (int) (maxPowerPoints + ppUpCounter * (maxPowerPoints * .2f));
            return true;
        }
        return false;
    }

    public boolean isPpMaxed() {
        return ppMax;
    }

    public boolean setPpMaxTrue() {
        if (!ppMax) {
            maxPowerPoints = (int) (info.getPowerPoints() * 1.6f);
            return ppMax = true;
        }
        return false;
    }

}

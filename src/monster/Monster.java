package monster;

import monster.move.Move;
import monster.move.MoveSet;
import monster.status.Status;

import java.util.random.RandomGenerator;

public abstract class Monster {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int special;
    private int speed;
    private int level;
    private MoveSet moveSet;
    private int dv;
    private Status status;

    public Monster() {
        setMoveSet(new MoveSet());
        setRandomDv();
        status = null;
    }

    public Monster(int health, int attack, int defense, int special, int speed, int level, MoveSet moveSet, int dv) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.special = special;
        this.speed = speed;
        this.level = level;
        this.moveSet = moveSet;
        this.dv = dv;
        status = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public MoveSet getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(MoveSet moveSet) {
        if (MoveSet.isValid(moveSet.getMoves())) {
            this.moveSet = moveSet;
        }
    }

    public void setMoveSet(Move[] moveSet) {
        if (MoveSet.isValid(moveSet)) {
            this.moveSet.setMoveSet(moveSet);
        }
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public abstract Typing getTyping();

    public void setRandomDv() {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        this.dv = rng.nextInt(0, 25);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract int getDexNum();
}

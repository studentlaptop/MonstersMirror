package monster;

import monster.monsters.SpeciesInfo;
import monster.move.Move;
import monster.move.MoveSet;
import monster.move.moves.physical.Physical;
import monster.status.Status;

import java.util.random.RandomGenerator;

public class Monster {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private final MoveSet moveSet;
    private int special;
    private int level;
    private int dv;
    private Status status;
    private int speed;
    private Typing typing;
    private int dexNum;

    public Monster() {
        moveSet = new MoveSet(Physical.TACKLE.getMove(), null, null, null);
        setRandomDv();
        status = null;
    }

    public Monster(SpeciesInfo species, MoveSet moveSet) {
        this.name = species.toString();
        this.typing = species.getTyping();
        this.moveSet = moveSet;
        this.dexNum = species.getDexNum();
        this.health = species.getBaseHealth();
        this.attack = species.getBaseAttack();
        this.defense = species.getBaseDefense();
        this.speed = species.getBaseSpeed();
        this.special = species.getBaseSpecial();
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

    public void setMoveSet(Move firstMove, Move secondMove, Move thirdMove, Move fourthMove) {
        moveSet.setMoves(firstMove, secondMove, thirdMove, fourthMove);
    }

    public MoveSet getMoveSet() {
        return moveSet;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public Typing getTyping() {
        return typing;
    }

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

    public int getDexNum() {
        return dexNum;
    }
}

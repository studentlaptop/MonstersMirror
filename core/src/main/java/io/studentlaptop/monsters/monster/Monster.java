package io.studentlaptop.monsters.monster;

import io.studentlaptop.monsters.item.ItemInfo;
import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.move.MoveInfo;
import io.studentlaptop.monsters.monster.move.MoveSet;
import io.studentlaptop.monsters.monster.status.Status;

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
    private SpeciesInfo species;
    private int friendship;
    private ItemInfo item;

    public Monster(SpeciesInfo species) {
        this.name = species.toString();
        this.typing = species.getTyping();
        this.moveSet = new MoveSet();
        this.dexNum = species.getDexNum();
        this.health = species.getBaseHealth();
        this.attack = species.getBaseAttack();
        this.defense = species.getBaseDefense();
        this.speed = species.getBaseSpeed();
        this.special = species.getBaseSpecial();
        this.species = species;
        this.level = 1;
        status = null;
        item = null;
        friendship = 0;
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
        item = null;
        friendship = 0;
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
            this.health = 0;
            return;
        }

        if (health > this.health) { // TODO: change 'this.health' to the monster's max health
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

    public void setMoves(MoveInfo firstMove, MoveInfo secondMove, MoveInfo thirdMove, MoveInfo fourthMove) {
        moveSet.setMoves(
                firstMove.create(),
                secondMove.create(),
                thirdMove.create(),
                fourthMove.create()
        );
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

    public Type getFirstType() {
        return typing.firstType();
    }
    public Type getSecondType() {
        return typing.secondType();
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

    public Move getFirstMove() {
        return moveSet.get(0);
    }

    public Move getSecondMove() {
        return moveSet.get(1);
    }

    public Move getThirdMove() {
        return moveSet.get(2);
    }

    public Move getFourthMove() {
        return moveSet.get(3);
    }

    public Move[] getMoves() {
        return moveSet.getMoves();
    }

    public SpeciesInfo getSpecies() {
        return species;
    }

    public void setSpecies(SpeciesInfo species) {
        this.species = species;
    }

    public ItemInfo getItem() {
        return item;
    }

    public void setItem(ItemInfo item) {
        this.item = item;
    }

    public ItemInfo useItem() {
        if (item == null) {
            return null;
        }

        var usedItem = item;
        item.battleHeldEffect(this);
        item = null;
        return usedItem;
    }

    public int getFriendship() {
        return friendship;
    }
    public void setFriendship(int friendship) {
        this.friendship = friendship;
    }

    /* check if evolvable (separate method or something. If so, put the if statements in that method)
       then play the evolve scene.
       if the evolution scene was not cancelled, only then call an evolve() method.
       Don't evolve during battle*/
    public void evolve() {
        if (species.getEvolution(this) != null) {
            if (name.equals(species.toString())) {
                setName(species.getEvolution(this).toString());
            }
            setSpecies(species.getEvolution(this));
        }
    }

    public void evolve(ItemInfo item) {
        if (species.getEvolution(this, item) != null) {
            if (name.equals(species.toString())) {
                setName(species.getEvolution(this, item).toString());
            }
            setSpecies(species.getEvolution(this, item));
        }
    }
}

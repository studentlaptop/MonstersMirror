package monster;

import item.Item;
import item.ItemInfo;
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
    private SpeciesInfo species;
    private int friendship;
    private Item item;

    /*public Monster() {
        moveSet = new MoveSet(Physical.TACKLE.getMove(), null, null, null);
        setRandomDv();
        status = null;
        item = null;
        friendship = 0;
    }*/

    public Monster(SpeciesInfo species, Move firstMove, Move secondMove, Move thirdMove, Move fourthMove) {
        this.name = species.toString();
        this.typing = species.getTyping();
        this.moveSet = new  MoveSet(firstMove, secondMove, thirdMove, fourthMove);
        this.dexNum = species.getDexNum();
        this.health = species.getBaseHealth();
        this.attack = species.getBaseAttack();
        this.defense = species.getBaseDefense();
        this.speed = species.getBaseSpeed();
        this.special = species.getBaseSpecial();
        this.species = species;
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

    public void setMoves(Move firstMove, Move secondMove, Move thirdMove, Move fourthMove) {
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item useItem() {
        if (item == null) {
            return null;
        }

        var usedItem = item;
        item.useByMonster(this);
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

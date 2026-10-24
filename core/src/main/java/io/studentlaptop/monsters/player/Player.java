package io.studentlaptop.monsters.player;

import com.badlogic.gdx.utils.ObjectIntMap;
import io.studentlaptop.monsters.item.Item;
import io.studentlaptop.monsters.monster.Monster;

import java.util.random.RandomGenerator;

public class Player {
    private final String name;
    private final ObjectIntMap<Item> inventory;
    private final Monster[] party;
    private final int TRAINER_ID;
    private final int SECRET_ID;
    private final boolean[] badges;

    public Player(String name) {
        this.name = name;
        inventory = new ObjectIntMap<>();
        party = new Monster[6];
        TRAINER_ID = setID();
        SECRET_ID = setID();
        badges = new boolean[8];
    }

    public String getName() {
        return name;
    }

    public int getTrainerID() {
        return TRAINER_ID;
    }

    public int getSecretID() {
        return SECRET_ID;
    }

    public int setID() {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
        return rng.nextInt(0, Integer.MAX_VALUE);
    }

    public ObjectIntMap<Item> getInventory() {
        return inventory;
    }

    public Monster[] getParty() {
        return party;
    }

    public int getTRAINER_ID() {
        return TRAINER_ID;
    }

    public boolean[] getBadges() {
        return badges;
    }

    public void setPartySlot(int index, Monster monster) {
        party[index] = monster;
    }
}

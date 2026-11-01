package io.studentlaptop.monsters.player;

import io.studentlaptop.monsters.item.ItemInfo;
import io.studentlaptop.monsters.monster.Monster;

import java.util.EnumMap;

public class Player {
    private final String name;
    private final EnumMap<ItemInfo, Integer> inventory;
    private final Monster[] party;
    private final int TRAINER_ID;
    private final int SECRET_ID;
    private final EnumMap<Badge, Boolean> badges;

    public Player(String name) {
        this.name = name;
        inventory = new EnumMap<>(ItemInfo.class);
        party = new Monster[6];
        TRAINER_ID = PlayerUtils.getTrainerID();
        SECRET_ID = PlayerUtils.getSecretID();
        badges = new EnumMap<>(Badge.class);
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

    public EnumMap<ItemInfo, Integer> getInventory() {
        return inventory;
    }

    public Monster[] getParty() {
        return party;
    }

    public EnumMap<Badge, Boolean> getBadges() {
        return badges;
    }

    public void setPartySlot(int index, Monster monster) {
        party[index] = monster;
    }

    public void setEmptySlot(Monster monster) {
        for (int i = 0; i < party.length; i++) {
            if (party[i] == null) {
                party[i] = monster;
                break;
            }
        }
    }

    public void putInventory(ItemInfo item) {
        if (inventory.containsKey(item)) {
            if (inventory.get(item) >= 99) {
                inventory.put(item, 99);
            } else {
                inventory.put(item, inventory.get(item) + 1);
            }
        } else {
            inventory.put(item, 1);
        }
    }
}

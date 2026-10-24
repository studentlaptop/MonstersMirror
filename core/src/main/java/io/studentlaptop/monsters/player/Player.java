package io.studentlaptop.monsters.player;

import io.studentlaptop.monsters.item.Item;
import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.save.SaveManager;

import java.util.HashMap;
import java.util.Map;
import java.util.random.RandomGenerator;

public class Player {
    private static String name;
    private static final Map<Item, Integer> inventory = new HashMap<>();
    private static final Monster[] party =  new Monster[6];
    private static final int TRAINER_ID = setTrainerID();
    private static final boolean[] badges = new boolean[8];

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player.name = name;
    }

    public static int getTrainerID() {
        return TRAINER_ID;
    }
    public static int setTrainerID() {
        if (SaveManager.isNewSave()) {
            RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
            SaveManager.setNewSave(false);
            return rng.nextInt(0, Integer.MAX_VALUE);
        }
        return 0;
    }
}

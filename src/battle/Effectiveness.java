package battle;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

import java.util.EnumMap;

public class Effectiveness {
    private final float[][] effectiveTable; // consider deleting
    private final EnumMap<Type, Integer> indices; // consider <Type, EnumMap> or <Type, HashMap> for individual effect

    public Effectiveness() {
        effectiveTable = new float[Type.values().length][Type.values().length];
        indices = new EnumMap<>(Type.class);
        populateMap();
        populateTable();
    }

    private void populateMap() {
        int index = 0;

        for (Type type : Type.values()) {
            indices.put(type, index);
            index++;
        }
    }

    private void populateTable() {
        for (int i = 0; i < effectiveTable.length; i++) {
            for (int j = 0; j < effectiveTable.length; j++) {
                if (i == j) {
                    effectiveTable[i][j] = 0.5f;
                }
            }
        }
    }

    public MoveEffect typeComparator(Move move, Monster monster) {
        if (move instanceof Attack attackMove) {

        }




        return MoveEffect.NO_EFFECT;
    }
}

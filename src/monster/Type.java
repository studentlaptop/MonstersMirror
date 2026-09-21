package monster;

import monster.move.Move;
import monster.move.interfaces.Attack;

public enum Type {
    BUG,
    ELECTRIC,
    FIRE,
    FLYING,
    FROST,
    GHOST,
    GROUND,
    GRASS,
    NORMAL,
    POISON,
    PSYCHIC,
    ROCK,
    WATER;

    public int typeComparator(Move move, Monster monster) {
        if (move instanceof Attack attackMove) {

        }




        return 0;
    }


}

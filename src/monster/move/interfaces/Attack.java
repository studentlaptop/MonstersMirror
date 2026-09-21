package monster.move.interfaces;

import monster.Monster;

public interface Attack {
    boolean attack(Monster user, Monster enemy);
}

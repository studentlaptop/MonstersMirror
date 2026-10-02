package monster.move.interfaces;

import monster.Monster;
import monster.Type;

public interface Attack {
    boolean attack(Monster user, Monster enemy);
    Type getType();
}

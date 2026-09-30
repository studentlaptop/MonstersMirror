package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class VineWhip extends Move implements Attack {
    public VineWhip() {
        super();
        setName("Vine Whip");
        setType(Type.GRASS);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public VineWhip(String name, Type type, int powerPoints) {
        super(name, type, powerPoints);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

}

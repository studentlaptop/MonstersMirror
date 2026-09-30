package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class Tackle extends Move implements Attack {
    public Tackle() {
        super();
        setName("Tackle");
        setType(Type.NORMAL);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public Tackle(String name, Type type, int powerPoints) {
        super(name, type, powerPoints);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

}

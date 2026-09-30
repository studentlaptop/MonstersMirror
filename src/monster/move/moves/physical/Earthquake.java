package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class Earthquake extends Move implements Attack {
    public Earthquake() {
        super();
        setName("Earthquake");
        setType(Type.GROUND);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public Earthquake(String name, Type type, int powerPoints) {
        super(name, type, powerPoints);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

}

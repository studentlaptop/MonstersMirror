package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class KarateChop extends Move implements Attack {
    public KarateChop() {
        super();
        setName("Karate Chop");
        setType(Type.FIGHTING);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public KarateChop(String name, Type type, int powerPoints) {
        super(name, type, powerPoints);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

}

package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class Tackle extends Move implements Attack {
    private Tackle() {
        super();
        setName("Tackle");
        setType(Type.NORMAL);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

    private static class TackleInstance {
        private static final Tackle instance = new Tackle();
    }

    public static Tackle getInstance() {
        return TackleInstance.instance;
    }
}

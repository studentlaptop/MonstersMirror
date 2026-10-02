package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class KarateChop extends Move implements Attack {
    private KarateChop() {
        super();
        setName("Karate Chop");
        setType(Type.FIGHTING);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

    private static class KarateChopInstance {
        private static final KarateChop instance = new KarateChop();
    }

    public static KarateChop getInstance() {
        return KarateChopInstance.instance;
    }
}

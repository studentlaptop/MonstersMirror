package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class Slam extends Move implements Attack {
    private Slam() {
        super();
        setName("Slam");
        setType(Type.NORMAL);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

    private static class SlamInstance {
        private static final Slam instance = new Slam();
    }

    public static Slam getInstance() {
        return SlamInstance.instance;
    }
}

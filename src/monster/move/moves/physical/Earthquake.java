package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class Earthquake extends Move implements Attack {
    private Earthquake() {
        super();
        setName("Earthquake");
        setType(Type.GROUND);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

    private static class EarthquakeInstance {
        private static final Earthquake instance = new Earthquake();
    }

    public static Earthquake getInstance() {
        return EarthquakeInstance.instance;
    }
}

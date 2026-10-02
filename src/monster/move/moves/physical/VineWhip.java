package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;

public final class VineWhip extends Move implements Attack {
    private VineWhip() {
        super();
        setName("Vine Whip");
        setType(Type.GRASS);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

    private static class VineWhipInstance {
        private static final VineWhip instance = new VineWhip();
    }

    public static VineWhip getInstance() {
        return VineWhipInstance.instance;
    }
}

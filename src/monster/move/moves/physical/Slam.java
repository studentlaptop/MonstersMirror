package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;

public final class Slam extends Move {
    public Slam() {
        super();
        setName("Slam");
        setType(Type.NORMAL);
        setAccuracy(95);
        setPowerPoints(25);
    }

    public Slam(String name, Type type, int powerPoints) {
        super(name, type, powerPoints);
    }

    public boolean attack(Monster user, Monster enemy) {

        return false;
    }

}

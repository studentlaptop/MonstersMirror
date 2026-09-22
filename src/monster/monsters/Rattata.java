package monster.monsters;

import monster.Monster;
import monster.Type;
import monster.evolution.Evolvable;
import monster.move.Move;
import monster.move.MoveSet;
import monster.move.moves.physical.PhysicalMoves;

public class Rattata extends Monster implements Evolvable {

    public Rattata() {
        super();
        setName("Rattata");
        setHealth(25);
        setAttack(5);
        setSpecial(5);
        setSpeed(5);
        setMoveSet(new Move[]{PhysicalMoves.TACKLE, null, null, null});
        setTyping(new Type[]{Type.NORMAL});
    }

    public Rattata(int health, int attack, int special, int speed, MoveSet moveSet, int dv) {
        super(health, attack, special, speed, moveSet, dv);
    }


    public boolean evolve() {
        return false;
    }
}

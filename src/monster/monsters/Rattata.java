package monster.monsters;

import monster.Monster;
import monster.Type;
import monster.evolution.Evolvable;
import monster.move.Move;
import monster.move.MoveSet;
import monster.move.moves.physical.Physical;

public class Rattata extends Monster implements Evolvable {

    public Rattata() {
        super();
        setName("Rattata");
        setHealth(25);
        setAttack(5);
        setDefense(5);
        setSpecial(5);
        setSpeed(5);
        setLevel(5);
        setMoveSet(new Move[]{Physical.TACKLE.getMove(), null, null, null});
        setTyping(new Type[]{Type.NORMAL});
    }

    public Rattata(int health, int attack, int defense, int special, int speed, int level, MoveSet moveSet, int dv) {
        super(health, attack, defense, special, speed, level, moveSet, dv);
    }

    public boolean evolve() {
        return false;
    }
}

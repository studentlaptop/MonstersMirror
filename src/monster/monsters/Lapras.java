package monster.monsters;

import monster.Monster;
import monster.Typing;
import monster.evolution.Evolvable;
import monster.move.Move;
import monster.move.MoveSet;
import monster.move.moves.physical.Physical;

import java.lang.invoke.MethodHandles;

public class Lapras extends Monster {
    private static final SpeciesInfo INFO = SpeciesInfo.LAPRAS;

    public Lapras() {
        super();
        setName(INFO.toString());
        setHealth(25);
        setAttack(5);
        setDefense(5);
        setSpecial(5);
        setSpeed(5);
        setLevel(5);
        setMoveSet(new Move[]{Physical.TACKLE.getMove(), null, null, null});
    }

    public Lapras(int health, int attack, int defense, int special, int speed, int level, MoveSet moveSet, int dv) {
        super(health, attack, defense, special, speed, level, moveSet, dv);
    }

    @Override
    public Typing getTyping() {
        return INFO.getTyping();
    }

    @Override
    public int getDexNum() {
        return INFO.getDexNum();
    }
}

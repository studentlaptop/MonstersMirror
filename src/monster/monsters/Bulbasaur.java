package monster.monsters;

import monster.Monster;
import monster.Typing;
import monster.evolution.Evolvable;
import monster.move.Move;
import monster.move.MoveSet;
import monster.move.moves.physical.Physical;

public class Bulbasaur extends Monster implements Evolvable {
    private static final SpeciesInfo INFO = SpeciesInfo.BULBASAUR;

    public Bulbasaur() {
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

    public Bulbasaur(int health, int attack, int defense, int special, int speed, int level, MoveSet moveSet, int dv) {
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

    @Override
    public boolean evolve() {
        return false;
    }
}

package monster.monsters;

import monster.Monster;
import monster.Typing;
import monster.evolution.Evolvable;
import monster.move.Move;
import monster.move.MoveSet;
import monster.move.moves.physical.Physical;

import java.lang.invoke.MethodHandles;

public class TestMonster extends Monster implements Evolvable {
    private static final int DEX_NUM = MonsterInfo.getDexNum(MethodHandles.lookup().lookupClass());
    private static final Typing TYPING = MonsterInfo.PIDGEY.getMonsterTyping();

    public TestMonster() {
        super();
        setName("Test Monster");
        setHealth(25);
        setAttack(5);
        setDefense(5);
        setSpecial(5);
        setSpeed(5);
        setLevel(5);
        setMoveSet(new Move[]{Physical.TACKLE.getMove(), null, null, null});
    }

    public TestMonster(int health, int attack, int defense, int special, int speed, int level, MoveSet moveSet, int dv) {
        super(health, attack, defense, special, speed, level, moveSet, dv);
    }

    @Override
    public Typing getTyping() {
        return TYPING;
    }

    @Override
    public int getDexNum() {
        return DEX_NUM;
    }


    public boolean evolve() {
        return false;
    }
}

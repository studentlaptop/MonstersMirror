package battle;

import monster.Monster;
import monster.move.Move;
import monster.move.interfaces.Attack;

public class Effectiveness {

    public static MoveModifier typeComparator(Move move, Monster monster) {
        if (move instanceof Attack attackMove) {
            MoveEffect moveEffect = move.getType().getMoveEffect(monster.getTyping().get(0));

            if (moveEffect == null) {
                return new MoveModifier(null, 1.0f);
            }

            return new MoveModifier(moveEffect, moveEffect.getModifier());
        }




        return new MoveModifier(MoveEffect.NO_EFFECT, MoveEffect.NO_EFFECT.getModifier());
    }

    public record MoveModifier(MoveEffect moveEffect, float modifier){};
}

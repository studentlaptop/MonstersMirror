package battle;

import monster.Monster;
import monster.move.Move;
import monster.move.interfaces.Attack;

class Effectiveness {

    static EffectModifier getEffectModifier(Move move, Monster monster) {
        if (move instanceof Attack) {
            MoveEffect firstTypeEffect = move.getType().getMoveEffect(monster.getTyping().get(0));

            if (monster.getTyping().length() == 2) {
                MoveEffect secondTypeEffect = move.getType().getMoveEffect(monster.getTyping().get(1));

                if (isIneffective(firstTypeEffect, secondTypeEffect)) {
                    return new EffectModifier(MoveEffect.NO_EFFECT, MoveEffect.NO_EFFECT.getModifier());
                }

                if (isNotEffective(firstTypeEffect, secondTypeEffect)) {
                    return new EffectModifier(MoveEffect.NOT_EFFECTIVE, MoveEffect.NOT_EFFECTIVE.getModifier());
                }

                if (isEffective(firstTypeEffect, secondTypeEffect)) {
                    return new EffectModifier(MoveEffect.EFFECTIVE, MoveEffect.EFFECTIVE.getModifier());
                }

                if (isSuperEffective(firstTypeEffect, secondTypeEffect)) {
                    return new EffectModifier(MoveEffect.SUPER_EFFECTIVE, MoveEffect.SUPER_EFFECTIVE.getModifier());
                }

                if (firstTypeEffect.equals(secondTypeEffect)) {
                    return new EffectModifier(firstTypeEffect, firstTypeEffect.getModifier() * secondTypeEffect.getModifier());
                }
            }

            return new EffectModifier(firstTypeEffect, firstTypeEffect.getModifier());
        }

        return null;
    }

    private static boolean isIneffective(MoveEffect firstTypeEffect, MoveEffect secondTypeEffect) {
        return firstTypeEffect.equals(MoveEffect.NO_EFFECT) || secondTypeEffect.equals(MoveEffect.NO_EFFECT);
    }

    private static boolean isNotEffective(MoveEffect firstTypeEffect, MoveEffect secondTypeEffect) {
        return (firstTypeEffect.getModifier() * secondTypeEffect.getModifier()) == MoveEffect.NOT_EFFECTIVE.getModifier();
    }

    private static boolean isEffective(MoveEffect firstTypeEffect, MoveEffect secondTypeEffect) {
        return (firstTypeEffect.getModifier() * secondTypeEffect.getModifier()) == MoveEffect.EFFECTIVE.getModifier();
    }

    private static boolean isSuperEffective(MoveEffect firstTypeEffect, MoveEffect secondTypeEffect) {
        return (firstTypeEffect.getModifier() * secondTypeEffect.getModifier()) == MoveEffect.SUPER_EFFECTIVE.getModifier();
    }

    record EffectModifier(MoveEffect moveEffect, float modifier) {
    }
}

package io.studentlaptop.monsters.battle;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.move.MoveInfo;
import io.studentlaptop.monsters.monster.move.MoveSet;

class Effectiveness {

    static EffectModifier getEffectModifier(Move move, Monster monster) {
        MoveEffect firstTypeEffect = move.getType().getMoveEffect(monster.getFirstType());

        if (monster.getSecondType() != null) {
            MoveEffect secondTypeEffect = move.getType().getMoveEffect(monster.getSecondType());

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

    record EffectModifier(MoveEffect moveEffect, float modifier) {}

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

    void main() {
        IO.println(getEffectModifier(MoveInfo.VOLT_TACKLE.create(), new Monster(SpeciesInfo.PIDGEY, new MoveSet())));
    }
}

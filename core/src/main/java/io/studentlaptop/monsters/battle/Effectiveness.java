package io.studentlaptop.monsters.battle;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.Type;
import io.studentlaptop.monsters.monster.Type.Effect;
import io.studentlaptop.monsters.monster.move.Move;

public class Effectiveness {
    public record EffectModifier(MoveEffect moveEffect, float modifier) {}

    public static EffectModifier getEffectModifier(Move move, Monster monster) {
        MoveEffect firstTypeEffect = getMoveEffect(move.getType(), monster.getFirstType());

        if (monster.getSecondType() != null) {
            MoveEffect secondTypeEffect = getMoveEffect(move.getType(), monster.getSecondType());

            if (isIneffective(firstTypeEffect, secondTypeEffect)) {
                return new EffectModifier(MoveEffect.NO_EFFECT, MoveEffect.NO_EFFECT.modifier);
            }

            if (isNotEffective(firstTypeEffect, secondTypeEffect)) {
                return new EffectModifier(MoveEffect.NOT_EFFECTIVE, MoveEffect.NOT_EFFECTIVE.modifier);
            }

            if (isEffective(firstTypeEffect, secondTypeEffect)) {
                return new EffectModifier(MoveEffect.EFFECTIVE, MoveEffect.EFFECTIVE.modifier);
            }

            if (isSuperEffective(firstTypeEffect, secondTypeEffect)) {
                return new EffectModifier(MoveEffect.SUPER_EFFECTIVE, MoveEffect.SUPER_EFFECTIVE.modifier);
            }

            if (firstTypeEffect.equals(secondTypeEffect)) {
                return new EffectModifier(firstTypeEffect, firstTypeEffect.modifier * secondTypeEffect.modifier);
            }
        }
        return new EffectModifier(firstTypeEffect, firstTypeEffect.modifier);
    }


    /**
     * Returns a {@link MoveEffect} enum from a {@link Type.Effect} enum associated with a given {@link Type} of a {@link Monster}.
     *
     * @param moveType the {@linkplain Type} of the {@linkplain Move} that is used to find an associated {@linkplain Effect}
     * @param monsterType the key with which the {@link MoveEffect} value is to be associated in a {@linkplain Effect}
     * @return The {@linkplain MoveEffect} value associated with {@code monsterType} key or {@linkplain MoveEffect#EFFECTIVE} if no key value pair exists
     */
    private static MoveEffect getMoveEffect(Type moveType, Type monsterType) {
        Type.Effect effectEnum = EffectivenessUtils.effects.get(moveType);
        return effectEnum.getEffects().getOrDefault(monsterType, MoveEffect.EFFECTIVE);
    }

    private static boolean isIneffective(MoveEffect firstTypeEffect, MoveEffect secondTypeEffect) {
        return firstTypeEffect.equals(MoveEffect.NO_EFFECT) || secondTypeEffect.equals(MoveEffect.NO_EFFECT);
    }

    private static boolean isNotEffective(MoveEffect firstTypeEffect, MoveEffect secondTypeEffect) {
        return (firstTypeEffect.modifier * secondTypeEffect.modifier) == MoveEffect.NOT_EFFECTIVE.modifier;
    }

    private static boolean isEffective(MoveEffect firstTypeEffect, MoveEffect secondTypeEffect) {
        return (firstTypeEffect.modifier * secondTypeEffect.modifier) == MoveEffect.EFFECTIVE.modifier;
    }

    private static boolean isSuperEffective(MoveEffect firstTypeEffect, MoveEffect secondTypeEffect) {
        return (firstTypeEffect.modifier * secondTypeEffect.modifier) == MoveEffect.SUPER_EFFECTIVE.modifier;
    }
}

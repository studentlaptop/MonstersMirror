package io.studentlaptop.monsters.battle;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import io.studentlaptop.monsters.monster.Type;
import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.move.MoveInfo;

public class Effectiveness {

    public static EffectModifier getEffectModifier(Move move, Monster monster) {
        MoveEffect firstTypeEffect = getMoveEffect(move, monster.getFirstType());

        if (monster.getSecondType() != null) {
            MoveEffect secondTypeEffect = getMoveEffect(move, monster.getSecondType());

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

    public record EffectModifier(MoveEffect moveEffect, float modifier) {}

    /**
     * Returns a {@link MoveEffect} enum from a {@link Type.TypeEffect} enum associated with a given {@link Type} of a {@link Monster}.
     *
     * @param move the {@linkplain Move} whose {@linkplain Type} is used to find an associated {@linkplain Type.TypeEffect}
     * @param monsterType the key with which the {@link MoveEffect} value is to be associated in a {@linkplain Type.TypeEffect}
     * @return The {@linkplain MoveEffect} value associated with {@code monsterType} key or {@linkplain MoveEffect#EFFECTIVE} if no key value pair exists
     * @throws IllegalArgumentException if no valid {@linkplain Type.TypeEffect} enum is found for the {@linkplain Type} of {@code move}
     */
    public static MoveEffect getMoveEffect(Move move, Type monsterType) {
        Type.TypeEffect typeEffect = Type.TypeEffect.typeEffectLookup(move.getType());

        if (typeEffect == null) {
            throw new NullPointerException("No " + Type.TypeEffect.class.getName() + " found for " + move.getInfo().toString() + "'s type: " + move.getType());
        }
        return (typeEffect.getEffects().get(monsterType) == null) ? MoveEffect.EFFECTIVE : typeEffect.getEffects().get(monsterType);
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
}

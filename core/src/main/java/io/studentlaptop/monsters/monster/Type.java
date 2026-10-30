package io.studentlaptop.monsters.monster;

import io.studentlaptop.monsters.battle.MoveEffect;
import io.studentlaptop.monsters.monster.move.Move;

import java.util.EnumMap;
import java.util.Map;

/**
 * Enums of the {@link Type} class can be applied to the typing of a {@link io.studentlaptop.monsters.monster.move.Move} and a {@link Monster}.
 * Each {@link Type} shall have an associated {@link EnumMap} in {@link TypeEffect}.
 * @see TypeEffect
 */
public enum Type {
    BUG,
    DARK,
    DRAGON,
    ELECTRIC,
    FIGHTING,
    FIRE,
    FLYING,
    GHOST,
    GRASS,
    GROUND,
    ICE,
    NORMAL,
    POISON,
    PSYCHIC,
    ROCK,
    STEEL,
    WATER,
    ;

    /**
     * Enums of the {@link TypeEffect} class are used to define Move v. Monster effectiveness.
     * Each enum shall be constructed with a corresponding {@link Type} and an {@link EnumMap}.
     * The {@linkplain EnumMap} shall use {@linkplain Type} enums as keys and {@link MoveEffect} enums as values.
     * @see MoveEffect
     * @see io.studentlaptop.monsters.battle.Effectiveness#getMoveEffect(Move, Type)
     */
    public enum TypeEffect {
        BUG_MOVE(BUG, new EnumMap<>(Map.of(
                GHOST, MoveEffect.NOT_EFFECTIVE,
                FIGHTING, MoveEffect.NOT_EFFECTIVE,
                FIRE, MoveEffect.NOT_EFFECTIVE,
                FLYING, MoveEffect.NOT_EFFECTIVE,
                POISON, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                DARK, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE,
                PSYCHIC, MoveEffect.SUPER_EFFECTIVE
        ))),

        DARK_MOVE(DARK, new EnumMap<>(Map.of(
                DARK, MoveEffect.NOT_EFFECTIVE,
                FIGHTING, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                GHOST, MoveEffect.SUPER_EFFECTIVE,
                PSYCHIC, MoveEffect.SUPER_EFFECTIVE
        ))),

        DRAGON_MOVE(DRAGON, new EnumMap<>(Map.of(
                STEEL, MoveEffect.NOT_EFFECTIVE,

                DRAGON, MoveEffect.SUPER_EFFECTIVE
        ))),

        ELECTRIC_MOVE(ELECTRIC, new EnumMap<>(Map.of(
                DRAGON, MoveEffect.NOT_EFFECTIVE,
                ELECTRIC, MoveEffect.NOT_EFFECTIVE,
                GRASS, MoveEffect.NOT_EFFECTIVE,

                GROUND, MoveEffect.NO_EFFECT,

                FLYING, MoveEffect.SUPER_EFFECTIVE,
                WATER, MoveEffect.SUPER_EFFECTIVE
        ))),

        FIGHTING_MOVE(FIGHTING, new EnumMap<>(Map.of(
                BUG, MoveEffect.NOT_EFFECTIVE,
                FLYING, MoveEffect.NOT_EFFECTIVE,
                POISON, MoveEffect.NOT_EFFECTIVE,
                PSYCHIC, MoveEffect.NOT_EFFECTIVE,

                GHOST, MoveEffect.NO_EFFECT,

                DARK, MoveEffect.SUPER_EFFECTIVE,
                ICE, MoveEffect.SUPER_EFFECTIVE,
                NORMAL, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE,
                STEEL, MoveEffect.SUPER_EFFECTIVE
        ))),

        FIRE_MOVE(FIRE, new EnumMap<>(Map.of(
                DRAGON, MoveEffect.NOT_EFFECTIVE,
                FIRE, MoveEffect.NOT_EFFECTIVE,
                ROCK, MoveEffect.NOT_EFFECTIVE,
                WATER, MoveEffect.NOT_EFFECTIVE,

                BUG, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE,
                ICE, MoveEffect.SUPER_EFFECTIVE,
                STEEL, MoveEffect.SUPER_EFFECTIVE
        ))),

        FLYING_MOVE(FLYING, new EnumMap<>(Map.of(
                ELECTRIC, MoveEffect.NOT_EFFECTIVE,
                ROCK, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                BUG, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE,
                FIGHTING, MoveEffect.SUPER_EFFECTIVE
        ))),

        GHOST_MOVE(GHOST, new EnumMap<>(Map.of(
                NORMAL, MoveEffect.NO_EFFECT,

                STEEL, MoveEffect.NOT_EFFECTIVE,

                GHOST, MoveEffect.SUPER_EFFECTIVE,
                PSYCHIC, MoveEffect.SUPER_EFFECTIVE
        ))),

        GRASS_MOVE(GRASS, new EnumMap<>(Map.of(
                BUG, MoveEffect.NOT_EFFECTIVE,
                DRAGON, MoveEffect.NOT_EFFECTIVE,
                FIRE, MoveEffect.NOT_EFFECTIVE,
                GRASS, MoveEffect.NOT_EFFECTIVE,
                FLYING, MoveEffect.NOT_EFFECTIVE,
                POISON, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                GROUND, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE,
                WATER, MoveEffect.SUPER_EFFECTIVE
        ))),

        GROUND_MOVE(GROUND, new EnumMap<>(Map.of(
                BUG, MoveEffect.NOT_EFFECTIVE,
                GRASS, MoveEffect.NOT_EFFECTIVE,

                FLYING, MoveEffect.NO_EFFECT,

                ELECTRIC, MoveEffect.SUPER_EFFECTIVE,
                FIRE, MoveEffect.SUPER_EFFECTIVE,
                POISON, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE,
                STEEL, MoveEffect.SUPER_EFFECTIVE
        ))),

        ICE_MOVE(ICE, new EnumMap<>(Map.of(
                ICE, MoveEffect.NOT_EFFECTIVE,
                WATER, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                DRAGON, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE,
                FLYING, MoveEffect.SUPER_EFFECTIVE,
                GROUND, MoveEffect.SUPER_EFFECTIVE
        ))),

        NORMAL_MOVE(NORMAL, new EnumMap<>(Map.of(
                ROCK, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                GHOST, MoveEffect.NO_EFFECT
        ))),


        POISON_MOVE(POISON, new EnumMap<>(Map.of(
                STEEL, MoveEffect.NO_EFFECT,

                GHOST, MoveEffect.NOT_EFFECTIVE,
                GROUND, MoveEffect.NOT_EFFECTIVE,
                POISON, MoveEffect.NOT_EFFECTIVE,
                ROCK, MoveEffect.NOT_EFFECTIVE,

                BUG, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE
        ))),

        PSYCHIC_MOVE(PSYCHIC, new EnumMap<>(Map.of(
                DARK, MoveEffect.NO_EFFECT,

                PSYCHIC, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                FIGHTING, MoveEffect.SUPER_EFFECTIVE,
                POISON, MoveEffect.SUPER_EFFECTIVE
        ))),

        ROCK_MOVE(ROCK, new EnumMap<>(Map.of(
                FIGHTING, MoveEffect.NOT_EFFECTIVE,
                GROUND, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                BUG, MoveEffect.SUPER_EFFECTIVE,
                FIRE, MoveEffect.SUPER_EFFECTIVE,
                FLYING, MoveEffect.SUPER_EFFECTIVE,
                ICE, MoveEffect.SUPER_EFFECTIVE
        ))),

        WATER_MOVE(WATER, new EnumMap<>(Map.of(
                DRAGON, MoveEffect.NOT_EFFECTIVE,
                GRASS, MoveEffect.NOT_EFFECTIVE,
                WATER, MoveEffect.NOT_EFFECTIVE,

                FIRE, MoveEffect.SUPER_EFFECTIVE,
                GROUND, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE
        ))),

        STEEL_MOVE(STEEL, new EnumMap<>(Map.of(
                FIRE, MoveEffect.NOT_EFFECTIVE,
                WATER, MoveEffect.NOT_EFFECTIVE,
                ELECTRIC, MoveEffect.NOT_EFFECTIVE,
                STEEL, MoveEffect.NOT_EFFECTIVE,

                ICE, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE
        )))
        ;

        private final Type type;
        private final EnumMap<Type, MoveEffect> effects;

        private static final EnumMap<Type, TypeEffect> typeEffectLookup = typeEffectLookup();

        TypeEffect(Type type, EnumMap<Type, MoveEffect> effects) {
            this.type = type;
            this.effects = effects;
        }

        private static EnumMap<Type, TypeEffect> typeEffectLookup() {
            EnumMap<Type, TypeEffect> typeEffectLookup = new EnumMap<>(Type.class);
            TypeEffect[] values = TypeEffect.values();
            for (TypeEffect typeEffect : values) {
                typeEffectLookup.put(typeEffect.type, typeEffect);
            }
            return typeEffectLookup;
        }

        public EnumMap<Type, MoveEffect> getEffects() {
            return effects;
        }

        public static TypeEffect typeEffectLookup(Type type) {
            return typeEffectLookup.get(type);
        }
    }
}

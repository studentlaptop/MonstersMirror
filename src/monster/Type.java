package monster;

import battle.MoveEffect;

import java.util.EnumMap;
import java.util.Map;

public enum Type {
    BUG {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> bugMove = TypeMove.BUG_MOVE.getEffects();
            return bugMove.get(monsterType);
        }
    },
    DRAGON {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> dragonMove = TypeMove.DRAGON_MOVE.getEffects();
            return dragonMove.get(monsterType);
        }
    },
    ELECTRIC {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> electricMove = TypeMove.ELECTRIC_MOVE.getEffects();
            return electricMove.get(monsterType);
        }
    },
    FIGHTING {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> fightingMove = TypeMove.FIGHTING_MOVE.getEffects();
            return fightingMove.get(monsterType);
        }
    },
    FIRE {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> fireMove = TypeMove.FIRE_MOVE.getEffects();
            return fireMove.get(monsterType);
        }
    },
    FLYING {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> flyingMove = TypeMove.FLYING_MOVE.getEffects();
            return flyingMove.get(monsterType);
        }
    },
    GHOST {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> ghostMove = TypeMove.GHOST_MOVE.getEffects();
            return ghostMove.get(monsterType);
        }
    },
    GROUND {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> groundMove = TypeMove.GROUND_MOVE.getEffects();
            return groundMove.get(monsterType);
        }
    },
    GRASS {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> grassMove = TypeMove.GRASS_MOVE.getEffects();
            return grassMove.get(monsterType);
        }
    },
    ICE {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> iceMove = TypeMove.ICE_MOVE.getEffects();
            return iceMove.get(monsterType);
        }
    },
    NORMAL {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> normalMove = TypeMove.NORMAL_MOVE.getEffects();
            return normalMove.get(monsterType);
        }
    },
    POISON {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> poisonMove = TypeMove.POISON_MOVE.getEffects();
            return poisonMove.get(monsterType);
        }
    },
    PSYCHIC {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> psychicMove = TypeMove.PSYCHIC_MOVE.getEffects();
            return psychicMove.get(monsterType);
        }
    },
    ROCK {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> rockMove = TypeMove.ROCK_MOVE.getEffects();
            return rockMove.get(monsterType);
        }
    },
    WATER {
        @Override
        public MoveEffect getMoveEffect(Type monsterType) {
            EnumMap<Type, MoveEffect> waterMove = TypeMove.WATER_MOVE.getEffects();
            return waterMove.get(monsterType);
        }
    };

    public abstract MoveEffect getMoveEffect(Type monsterType);

    private enum TypeMove {
        BUG_MOVE(new EnumMap<>(Map.of(
                GHOST, MoveEffect.NOT_EFFECTIVE,
                FIGHTING, MoveEffect.NOT_EFFECTIVE,
                FIRE, MoveEffect.NOT_EFFECTIVE,
                FLYING, MoveEffect.NOT_EFFECTIVE,

                GRASS, MoveEffect.SUPER_EFFECTIVE,
                POISON, MoveEffect.SUPER_EFFECTIVE,
                PSYCHIC, MoveEffect.SUPER_EFFECTIVE
        ))),

        DRAGON_MOVE(new EnumMap<>(Map.of(
                DRAGON, MoveEffect.SUPER_EFFECTIVE
        ))),

        ELECTRIC_MOVE(new EnumMap<>(Map.of(
                DRAGON, MoveEffect.NOT_EFFECTIVE,
                ELECTRIC, MoveEffect.NOT_EFFECTIVE,
                GRASS, MoveEffect.NOT_EFFECTIVE,

                GROUND, MoveEffect.NO_EFFECT,

                FLYING, MoveEffect.SUPER_EFFECTIVE,
                WATER, MoveEffect.SUPER_EFFECTIVE
        ))),

        FIGHTING_MOVE(new EnumMap<>(Map.of(
                BUG, MoveEffect.NOT_EFFECTIVE,
                FLYING, MoveEffect.NOT_EFFECTIVE,
                POISON, MoveEffect.NOT_EFFECTIVE,
                PSYCHIC, MoveEffect.NOT_EFFECTIVE,

                GHOST, MoveEffect.NO_EFFECT,

                ICE, MoveEffect.SUPER_EFFECTIVE,
                NORMAL, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE
        ))),

        FIRE_MOVE(new EnumMap<>(Map.of(
                DRAGON, MoveEffect.NOT_EFFECTIVE,
                FIRE, MoveEffect.NOT_EFFECTIVE,
                ROCK, MoveEffect.NOT_EFFECTIVE,
                WATER, MoveEffect.NOT_EFFECTIVE,

                BUG, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE,
                ICE, MoveEffect.SUPER_EFFECTIVE
        ))),

        FLYING_MOVE(new EnumMap<>(Map.of(
                ELECTRIC, MoveEffect.NOT_EFFECTIVE,
                ROCK, MoveEffect.NOT_EFFECTIVE,

                BUG, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE,
                FIGHTING, MoveEffect.SUPER_EFFECTIVE
        ))),

        GHOST_MOVE(new EnumMap<>(Map.of(
                NORMAL, MoveEffect.NO_EFFECT,
                PSYCHIC, MoveEffect.NO_EFFECT,

                GHOST, MoveEffect.SUPER_EFFECTIVE
        ))),

        GROUND_MOVE(new EnumMap<>(Map.of(
                BUG, MoveEffect.NOT_EFFECTIVE,
                GRASS, MoveEffect.NOT_EFFECTIVE,

                FLYING, MoveEffect.NO_EFFECT,

                ELECTRIC, MoveEffect.SUPER_EFFECTIVE,
                FIRE, MoveEffect.SUPER_EFFECTIVE,
                POISON, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE
        ))),

        GRASS_MOVE(new EnumMap<>(Map.of(
                BUG, MoveEffect.NOT_EFFECTIVE,
                DRAGON, MoveEffect.NOT_EFFECTIVE,
                FIRE, MoveEffect.NOT_EFFECTIVE,
                GRASS, MoveEffect.NOT_EFFECTIVE,
                FLYING, MoveEffect.NOT_EFFECTIVE,
                POISON, MoveEffect.NOT_EFFECTIVE,

                GROUND, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE,
                WATER, MoveEffect.SUPER_EFFECTIVE
        ))),

        ICE_MOVE(new EnumMap<>(Map.of(
                ICE, MoveEffect.NOT_EFFECTIVE,
                WATER, MoveEffect.NOT_EFFECTIVE,

                DRAGON, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE,
                FLYING, MoveEffect.SUPER_EFFECTIVE,
                GROUND, MoveEffect.SUPER_EFFECTIVE
        ))),

        NORMAL_MOVE(new EnumMap<>(Map.of(
                ROCK, MoveEffect.NOT_EFFECTIVE,

                GHOST, MoveEffect.NO_EFFECT
        ))),


        POISON_MOVE(new EnumMap<>(Map.of(
                GHOST, MoveEffect.NOT_EFFECTIVE,
                GROUND, MoveEffect.NOT_EFFECTIVE,
                POISON, MoveEffect.NOT_EFFECTIVE,
                ROCK, MoveEffect.NOT_EFFECTIVE,

                BUG, MoveEffect.SUPER_EFFECTIVE,
                GRASS, MoveEffect.SUPER_EFFECTIVE
        ))),

        PSYCHIC_MOVE(new EnumMap<>(Map.of(
                PSYCHIC, MoveEffect.NOT_EFFECTIVE,

                FIGHTING, MoveEffect.SUPER_EFFECTIVE,
                POISON, MoveEffect.SUPER_EFFECTIVE
        ))),

        ROCK_MOVE(new EnumMap<>(Map.of(
                FIGHTING, MoveEffect.NOT_EFFECTIVE,
                GROUND, MoveEffect.NOT_EFFECTIVE,

                BUG, MoveEffect.SUPER_EFFECTIVE,
                FIRE, MoveEffect.SUPER_EFFECTIVE,
                FLYING, MoveEffect.SUPER_EFFECTIVE,
                ICE, MoveEffect.SUPER_EFFECTIVE
        ))),

        WATER_MOVE(new EnumMap<>(Map.of(
                DRAGON, MoveEffect.NOT_EFFECTIVE,
                GRASS, MoveEffect.NOT_EFFECTIVE,
                WATER, MoveEffect.NOT_EFFECTIVE,

                FIRE, MoveEffect.SUPER_EFFECTIVE,
                GROUND, MoveEffect.SUPER_EFFECTIVE,
                ROCK, MoveEffect.SUPER_EFFECTIVE
        )))
        ;

        private final EnumMap<Type, MoveEffect> effects;

        TypeMove(EnumMap<Type, MoveEffect> effects) {
            this.effects = effects;
        }

        private EnumMap<Type, MoveEffect> getEffects() {
            return effects;
        }
    }
}

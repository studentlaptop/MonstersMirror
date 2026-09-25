package monster;

import battle.MoveEffect;

import java.util.EnumMap;
import java.util.Map;

public enum Type {
    BUG {
        @Override
        void getComboEffect(Type monster) {
            EnumMap<Type, MoveEffect> george =  TypeCombo.BUG_COMBO.getComboEffects();
            george.get(monster);

        }
    },
    DRAGON {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    ELECTRIC {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    FIRE {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    FLYING {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    FROST {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    GHOST {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    GROUND {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    GRASS {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    ICE {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    NORMAL {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    POISON {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    PSYCHIC {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    ROCK {
        @Override
        void getComboEffect(Type monster) {

        }
    },
    WATER {
        @Override
        void getComboEffect(Type monster) {

        }
    };

    abstract void getComboEffect(Type monster);

    private enum TypeCombo {
        BUG_COMBO(new EnumMap<>(Map.of(Type.BUG, MoveEffect.NOT_EFFECTIVE, Type.FIRE, MoveEffect.NOT_EFFECTIVE, Type.PSYCHIC, MoveEffect.NOT_EFFECTIVE)));

        public EnumMap<Type, MoveEffect> getComboEffects() {
            return comboEffects;
        }

        final EnumMap<Type, MoveEffect> comboEffects;

        TypeCombo(EnumMap<Type, MoveEffect> comboEffects) {
            this.comboEffects = comboEffects;
        }
    }
}

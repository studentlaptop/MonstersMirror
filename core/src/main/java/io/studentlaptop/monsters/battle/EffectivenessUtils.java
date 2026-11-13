package io.studentlaptop.monsters.battle;

import io.studentlaptop.monsters.monster.Type;

import java.util.EnumMap;

public class EffectivenessUtils {
    static EnumMap<Type, Type.Effect> effects = new EnumMap<>(Type.class);

    static {
        for (Type.Effect effect : Type.Effect.values()) {
            if (!effects.containsKey(effect.getType())) {
                effects.put(effect.getType(), effect);
            } else {
                throw new IllegalArgumentException("Multiple " + Type.Effect.class.getSimpleName() + "  associated with " + effect.getType());
            }
        }

        for (Type type : Type.values()) {
            if (effects.get(type) == null) {
                throw new EnumConstantNotPresentException(Type.Effect.class, " not found for " + type);
            }
        }
    }
}

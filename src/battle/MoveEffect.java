package battle;

/**
 * Enums of the {@link MoveEffect} class describe the relation & damage multiplier of Move v. Monster type comparisons.
 * See {@link monster.Type} for more information.
 */
public enum MoveEffect {
    NO_EFFECT(0.0f),
    NOT_EFFECTIVE(0.5f),
    EFFECTIVE(1.0f),
    SUPER_EFFECTIVE(2.0f);

    private final float modifier;

    MoveEffect(float modifier) {
        this.modifier = modifier;
    }

    public float getModifier() {
        return modifier;
    }
}

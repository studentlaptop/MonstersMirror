package battle;

public enum MoveEffect {
    NO_EFFECT(0.0f),
    NOT_EFFECTIVE(0.5f),
    SUPER_EFFECTIVE(2.0f);

    final float modifier;

    public float getModifier() {
        return modifier;
    }

    MoveEffect(float modifier) {
        this.modifier = modifier;
    }
}

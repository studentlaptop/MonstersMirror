package monster;

public record Typing(Type firstType, Type secondType) {
    public Typing(Type type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        this(type, null);
    }

    public Typing {
        if (firstType == secondType) {
            throw new IllegalArgumentException("Duplicate types: " + firstType + " and " + secondType);
        }
    }
}

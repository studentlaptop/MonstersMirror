package monster;

public class Typing {
    private Type[] typing;

    public Typing() {
        typing = new Type[]{null, null};
    }

    public Typing(Type[] typing) {
        if (!isValid(typing)) {
            throw new IllegalArgumentException("Invalid typing");
        }
        this.typing = typing;
    }

    public static boolean isValid(Type[] typing) {
        if (typing.length != 0 && typing.length <= 2) {
            return typing.length != 2 || typing[0] != typing[1];
        }
        return false;
    }

    public Type[] getTyping() {
        return typing;
    }

    public Type get(int index) {
        return typing[index];
    }

    public void setTyping(Type[] typing) {
        if (isValid(typing)) {
            this.typing = typing;
        }
    }

    public int length() {
        return typing.length;
    }
}

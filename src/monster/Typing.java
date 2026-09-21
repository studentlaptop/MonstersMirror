package monster;

public class Typing {
    private Type[] typing;

    public Typing() {
        typing = new Type[]{null, null};
    }

    public Typing(Type[] typing) {
        if (!isValid(typing)) {
            throw new IllegalArgumentException("Typing must be one or two indices");
        }
        this.typing = typing;
    }

    public boolean isValid(Type[] typing) {
        return typing.length != 0 && typing.length <= 2;
    }


}

package monster;

import java.util.Arrays;

public class Typing {
    private Type[] typing;

    public Typing(Type[] typing) {
        if (isValid(typing)) {
            this.typing = typing;
        }
    }

    public Typing(Typing typing) {
        if (isValid(typing.getTypes())) {
            this.typing = typing.getTypes();
        }
    }

    public static boolean isValid(Type[] typing) {
        if (typing.length != 0 && typing.length <= 2) {
            for (Type type: typing) {
                if (type == null) {
                    throw new NullPointerException("Invalid Type");
                }
            }

            if (typing.length == 2 && typing[0] == typing[1]) {
                throw new IllegalArgumentException("Duplicate types: " + Arrays.toString(typing));
            }
            return true;
        }
        throw new IllegalArgumentException("typing length out of range");
    }

    public Type[] getTypes() {
        return typing;
    }

    public Type get(int index) {
        return typing[index];
    }

    public void setTypes(Type[] typing) {
        if (isValid(typing)) {
            this.typing = typing;
        }
    }

    public int length() {
        return typing.length;
    }
}

package monster.move;

public class MoveSet {
    private Move[] moveSet;

    public MoveSet() {
        moveSet = new Move[]{null, null, null, null};
    }

    public MoveSet(Move[] moveSet) {
        if (!isValid(moveSet)) {
            throw new IllegalArgumentException("moveSet must be of length 4");
        }
        this.moveSet = moveSet;
    }

    public MoveSet(MoveSet moveSetObj) {
        this.moveSet = moveSetObj.moveSet;
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public static boolean isValid(Move[] moveSet) { // TODO: ensure no duplicates are present
        return moveSet.length == 4;
    }

    public Move get(int index) {
        return moveSet[index];
    }

    public Move[] getMoves() {
        return moveSet;
    }

    public void setMoveSet(Move[] moveSet) {
        this.moveSet = moveSet;
    }

    public int indexOf(Move move) {
        for (int i = 0; i < moveSet.length; i++) {
            if (moveSet[i] == move) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Move move) {
        return indexOf(move) >= 0;
    }

    public boolean forget(Move move) {
        return false;
    }

    public boolean learn(Move move) {
        int index = indexOf(null);

        if (contains(move)) {
            return false;
        }

        if (index >= 0) {
            moveSet[index] = move;
            return true;
        }

        if (!contains(null)) {
            return forget(move);
        }
        return false;
    }
}

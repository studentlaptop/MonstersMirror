package monster.move;

import java.util.HashSet;
import java.util.Set;

public class MoveSet {
    private Move[] moveSet;

    public MoveSet() {
        moveSet = new Move[4];
    }

    public MoveSet(Move[] moveSet) {
        if (isValid(moveSet)) {
            this.moveSet = moveSet;
        }
    }

    public MoveSet(MoveSet moveSet) {
        if (isValid(moveSet.getMoves())) {
            this.moveSet = moveSet.moveSet;
        }
    }

    public static boolean isValid(Move[] moveSet) {
        if (moveSet.length == 4) {
            Set<Move> duplicateCheck = new HashSet<>();
            for (Move move : moveSet) {
                if (move == null) {
                    continue;
                }
                if (!duplicateCheck.add(move)) {
                    throw new IllegalArgumentException("Duplicate move: " + move.getName());
                }
            }
            return true;
        }
        throw new IllegalArgumentException("moveSet length out of range");
    }

    public Move get(int index) {
        return moveSet[index];
    }

    public Move[] getMoves() {
        return moveSet;
    }

    public void setMoveSet(Move[] moveSet) {
        if (isValid(moveSet)) {
            this.moveSet = moveSet;
        }
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

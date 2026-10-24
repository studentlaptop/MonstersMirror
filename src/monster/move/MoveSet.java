package monster.move;

import java.util.HashSet;
import java.util.Set;

public class MoveSet {
    private Move[] moves;

    public MoveSet() {
        this.moves = new Move[4];
    }

    public MoveSet(MoveInfo firstMove) {
        if (isValid(new Move[]{firstMove.create(), null, null, null})) {
            moves = new Move[]{firstMove.create(), null, null, null};
        }
    }

    public MoveSet(MoveInfo firstMove, MoveInfo secondMove) {
        if (isValid(new Move[]{firstMove.create(), secondMove.create(), null, null})) {
            moves = new Move[]{firstMove.create(), secondMove.create(), null, null};
        }
    }

    public MoveSet(MoveInfo firstMove, MoveInfo secondMove, MoveInfo thirdMove) {
        if (isValid(new Move[]{firstMove.create(), secondMove.create(), thirdMove.create(), null})) {
            moves = new Move[]{firstMove.create(), secondMove.create(), thirdMove.create(), null};
        }
    }

    public MoveSet(MoveInfo firstMove, MoveInfo secondMove, MoveInfo thirdMove, MoveInfo fourthMove) {
        if (isValid(new Move[]{firstMove.create(), secondMove.create(), thirdMove.create(), fourthMove.create()})) {
            moves = new Move[]{firstMove.create(), secondMove.create(), thirdMove.create(), fourthMove.create()};
        }
    }

    public MoveSet(MoveSet moveSet) {
        if (isValid(moveSet.getMoves())) {
            this.moves = moveSet.moves;
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
        return moves[index];
    }

    public Move[] getMoves() {
        return moves;
    }

    public void setMoves(Move firstMove, Move secondMove, Move thirdMove, Move fourthMove) {
        if (isValid(new Move[]{firstMove, secondMove, thirdMove, fourthMove})) {
            moves[0] = firstMove;
            moves[1] = secondMove;
            moves[2] = thirdMove;
            moves[3] = fourthMove;
        }
    }

    public int indexOf(Move move) {
        for (int i = 0; i < moves.length; i++) {
            if (moves[i] == move) {
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
            moves[index] = move;
            return true;
        }

        if (!contains(null)) {
            return forget(move);
        }
        return false;
    }

    public Move getFirstMove() {
        return moves[0];
    }

    public Move getSecondMove() {
        return moves[1];
    }

    public Move getThirdMove() {
        return moves[2];
    }

    public Move getFourthMove() {
        return moves[3];
    }
}

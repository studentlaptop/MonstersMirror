package io.studentlaptop.monsters.monster.moveset;

import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.move.MoveInfo;

import java.util.*;

public class Moveset extends AbstractList<Move> {
    private final Move[] moves;
    private static final int REQ_LENGTH = 4;

    public Moveset() {
        this.moves = new Move[REQ_LENGTH];
    }

    public Moveset(Builder builder) {
        this.moves = builder.moves;
    }

    public Moveset(Collection<Move> c) {
        MovesetUtils.length.validate(c, REQ_LENGTH);
        MovesetUtils.validateNoDuplicates(c);

        if (c.isEmpty()) {
            moves = new Move[REQ_LENGTH];
        } else {
            Move[] a = c.toArray(new Move[REQ_LENGTH]);
            if (c.getClass() == Moveset.class) {
                moves = a;
            } else {
                moves = Arrays.copyOf(a, REQ_LENGTH, Move[].class);
            }
        }
    }

    @Override
    public int size() {
        return moves.length;
    }

    @Override
    public Move get(int index) {
        return moves[index];
    }

    @Override
    public Move set(int index, Move move) {
        return moves[index] = move;
    }

    @Override
    public void add(int index, Move move) {
        set(index, move);
    }

    @Override
    public boolean add(Move move) {
        if (contains(null)) {
            set(indexOf(null), move);
            return true;
        }
        return false;
    }

    @Override
    public Move remove(int index) {
        Move previous = moves[index];
        moves[index] = null;
        return previous;
    }

    @Override
    public int indexOf(Object o) {
        if (o instanceof Move || o == null) {
            return super.indexOf(o);
        }
        if (o instanceof MoveInfo) {
            for (Move move : moves) {
                if (move == null) {
                    continue;
                }
                if (move.getInfo().equals(o)) {
                    return super.indexOf(move);
                }
            }
        }
        throw new ClassCastException(o.toString() + " is not a Move");
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

    public Move getSecond() {
        return moves[1];
    }

    public Move getThird() {
        return moves[2];
    }

    public Move getFourth() {
        return moves[3];
    }

    @Override
    public boolean contains(Object obj) {
        if (obj instanceof Move || obj == null) {
            return super.contains(obj);
        }
        if (obj instanceof MoveInfo) {
            for (Move move : moves) {
                if (move == null) {
                    continue;
                }
                if (move.getInfo().equals(obj)) {
                    return true;
                }
            }
        }
        throw new ClassCastException(obj.toString() + " is not a Move");
    }

    public static class Builder {
        private final Move[] moves;

        public Builder(MoveInfo firstMove) {
            this.moves = new Move[]{new Move(firstMove), null, null, null};
        }

        public Builder second(MoveInfo secondMove) {
            moves[1] = new Move(secondMove);
            return this;
        }

        public Builder third(MoveInfo thirdMove) {
            moves[2] = new Move(thirdMove);
            return this;
        }

        public Builder fourth(MoveInfo fourthMove) {
            moves[3] = new Move(fourthMove);
            return this;
        }

        public Moveset build() {
            MovesetUtils.validateNoDuplicates(Arrays.asList(moves));
            return new Moveset(this);
        }
    }
}

package io.studentlaptop.monsters.monster.move;

import java.util.*;

public class MoveSet extends AbstractList<Move> {
    private Move[] moves;
    private static final int REQ_LENGTH = 4;

    public MoveSet() {
        this.moves = new Move[REQ_LENGTH];
    }

    public MoveSet(Builder builder) {
        if (Builder.isValid(builder.moves)) {
            this.moves = builder.moves;
        }
    }

    public MoveSet(Collection<Move> c) {
        if (isValid(c)) {
            if (c.isEmpty()) {
                moves = new Move[REQ_LENGTH];
            } else {
                Move[] a = c.toArray(new Move[REQ_LENGTH]);
                if (c.getClass() == MoveSet.class) {
                    moves = a;
                } else {
                    moves = Arrays.copyOf(a, REQ_LENGTH, Move[].class);
                }
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
        return moves[index] = null;
    }

    @Override
    public int indexOf(Object o) {
        if (o instanceof Move || o == null) {
            return super.indexOf(o);
        }
        throw new ClassCastException(o.toString() + " is not a Move");
    }

    @Override
    public boolean contains(Object obj) {
        if (obj instanceof Move || obj == null) {
            return super.contains(obj);
        }
        throw new ClassCastException(obj.toString() + " is not a Move");
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

    private static boolean isValid(Collection<Move> c) {
        if (c.size() == REQ_LENGTH) {
            Set<MoveInfo> duplicateCheck = new HashSet<>();
            for (Move move : c) {
                if (move == null) {
                    continue;
                }
                if (!duplicateCheck.add(move.getInfo())) {
                    throw new IllegalArgumentException("Duplicate move: " + move.getName());
                }
            }
            return true;
        }
        throw new IllegalArgumentException("moveSet length out of range");
    }

    public static class Builder {
        private Move[] moves;

        public Builder(MoveInfo firstMove) {
            this.moves = new Move[]{firstMove.create(), null, null, null};
        }

        public Builder second(MoveInfo secondMove) {
            moves[1] = secondMove.create();
            return this;
        }

        public Builder third(MoveInfo thirdMove) {
            moves[2] = thirdMove.create();
            return this;
        }

        public Builder fourth(MoveInfo fourthMove) {
            moves[3] = fourthMove.create();
            return this;
        }

        public MoveSet build() {
            return new MoveSet(this);
        }

        private static boolean isValid(Move[] moves) {
            if (moves.length == REQ_LENGTH) {
                Set<MoveInfo> duplicateCheck = new HashSet<>();
                for (Move move : moves) {
                    if (move == null) {
                        continue;
                    }
                    if (!duplicateCheck.add(move.getInfo())) {
                        throw new IllegalArgumentException("Duplicate move: " + move.getName());
                    }
                }
                return true;
            }
            throw new IllegalArgumentException("moveSet length out of range");
        }
    }
}

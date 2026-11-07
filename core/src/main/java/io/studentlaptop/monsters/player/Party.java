package io.studentlaptop.monsters.player;

import io.studentlaptop.monsters.monster.Monster;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

public class Party extends AbstractList<Monster> {
    private Monster[] party;
    private static final int REQ_LENGTH = 6;

    Party() {
        party = new Monster[REQ_LENGTH];
    }

    Party(Builder builder) {
        party = builder.party;
    }

    Party(Collection<Monster> c) {
        if (isValid(c)) {
            if (c.isEmpty()) {
                party = new Monster[REQ_LENGTH];
            } else {
                Monster[] a = c.toArray(new Monster[REQ_LENGTH]);
                if (c.getClass() == Party.class) {
                    party = a;
                } else {
                    party = Arrays.copyOf(a, REQ_LENGTH, Monster[].class);
                }
            }
        }
    }

    @Override
    public int size() {
        return party.length;
    }

    @Override
    public Monster get(int index) {
        return party[index];
    }

    @Override
    public Monster set(int index, Monster monster) {
        Monster previous = party[index];
        party[index] = monster;
        return previous;
    }

    @Override
    public void add(int index, Monster monster) {
        set(index, monster);
    }

    @Override
    public boolean add(Monster monster) {
        if (contains(null)) {
            set(indexOf(null), monster);
            return true;
        }
        return false;
    }

    @Override
    public Monster remove(int index) {
        return party[index] = null;
    }

    /**
     * Destructs Party contents.
     * This method planned to only be used after defeating a Trainer in battle.
     *
     */
    @Override
    public void clear() {
        party = null;
    }

    @Override
    public int indexOf(Object o) {
        if (o instanceof Monster || o == null) {
            return super.indexOf(o);
        }
        throw new ClassCastException(o.toString() + " is not a Monster");
    }

    @Override
    public boolean contains(Object obj) {
        if (obj instanceof Monster || obj == null) {
            return super.contains(obj);
        }
        throw new ClassCastException(obj.toString() + " is not a Monster");
    }

    public Monster getSecond() {
        return party[1];
    }

    public Monster getThird() {
        return party[2];
    }

    public Monster getFourth() {
        return party[3];
    }

    public Monster getFifth() {
        return party[4];
    }

    public Monster getSixth() {
        return party[5];
    }

    private static boolean isValid(Collection<Monster> c) {
        if (c.size() <= REQ_LENGTH) {
            return true;
        }
        throw new IllegalArgumentException(c + " length out of range");
    }

    public static class Builder {
        private Monster[] party;

        public Builder() {
            party = new Monster[REQ_LENGTH];
        }

        public Builder first(Monster monster) {
            party[0] = monster;
            return this;
        }

        public Builder second(Monster monster) {
            party[1] = monster;
            return this;
        }

        public Builder third(Monster monster) {
            party[2] = monster;
            return this;
        }

        public Builder fourth(Monster monster) {
            party[3] = monster;
            return this;
        }

        public Builder fifth(Monster monster) {
            party[4] = monster;
            return this;
        }

        public Builder sixth(Monster monster) {
            party[5] = monster;
            return this;
        }

        public Party build() {
            return new Party(this);
        }
    }
}

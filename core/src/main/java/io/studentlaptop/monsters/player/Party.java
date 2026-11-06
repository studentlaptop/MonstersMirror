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
        return party[index] = monster;
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

    private static boolean isValid(Collection<Monster> c) {
        return c.size() <= REQ_LENGTH;
    }
}

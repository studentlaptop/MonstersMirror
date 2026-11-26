package io.studentlaptop.monsters.interfaces;

import java.util.Collection;

public interface ValidateLength<T> {
    void validate(Collection<T> c, int length);
}

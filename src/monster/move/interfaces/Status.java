package monster.move.interfaces;

import monster.Monster;

public interface Status {
    int statusChance();

    boolean inflictStatus(Monster monster);

    boolean isUnaffected(Monster monster);
}

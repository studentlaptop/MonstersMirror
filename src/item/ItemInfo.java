package item;

import monster.Monster;

public enum ItemInfo {
    FIRE_STONE {
        @Override
        public void effect(Monster monster) {
            monster.evolve(this);
        }
    },
    WATER_STONE {
        @Override
        public void effect(Monster monster) {
            monster.evolve(this);
        }
    },
    LIGHTNING_STONE {
        @Override
        public void effect(Monster monster) {
            monster.evolve(this);
        }
    },
    ;

    public void effect(Monster monster) {}
    public void effect(Monster monster, ItemInfo info) {}
}

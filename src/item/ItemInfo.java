package item;

import monster.Monster;

public enum ItemInfo {
    FIRE_STONE {
        @Override
        public void effect(Monster monster) {
            monster.evolve(new Item(ItemInfo.FIRE_STONE));
        }
    },
    WATER_STONE {
        @Override
        public void effect(Monster monster) {
            monster.evolve(new Item(ItemInfo.WATER_STONE));
        }
    },
    LIGHTNING_STONE {
        @Override
        public void effect(Monster monster) {
            monster.evolve(new Item(ItemInfo.LIGHTNING_STONE));
        }
    },
    ;

    public void effect(Monster monster) {}
    public void effect(Monster monster, ItemInfo info) {}
}

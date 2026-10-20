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
    BERRY {
        @Override
        public void effect(Monster monster) {
            monster.setHealth(monster.getHealth() + 10);
        }

        @Override
        public void battleEffect(Monster monster) {
            if (monster.getHealth() <= monster.getSpecies().getBaseHealth() / 2) { // TODO: change right hand condition to monster's max health
                monster.setHealth(monster.getHealth() + 10);
            }
        }
    }
    ;

    public void effect() {}
    public void effect(Monster monster) {}
    public void battleEffect() {}
    public void battleEffect(Monster monster) {}
}

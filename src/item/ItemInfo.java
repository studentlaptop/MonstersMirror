package item;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.status.statuses.Burn;
import monster.status.statuses.Sleep;
import monster.status.statuses.Statuses;

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
    },
    GOLD_BERRY {
        @Override
        public void effect(Monster monster) {
            monster.setHealth(monster.getHealth() + 30);
        }
        @Override
        public void battleEffect(Monster monster) {
            if (monster.getHealth() <= monster.getSpecies().getBaseHealth() / 2) { // TODO: change right hand condition to monster's max health
                monster.setHealth(monster.getHealth() + 30);
            }
        }
    },
    ICE_BERRY {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Burn) { // TODO: change monster status to a Status object with a parameter for a Statuses Enum
                monster.setStatus(null);
            }
        }
        @Override
        public void battleEffect(Monster monster) {
            if (monster.getStatus() instanceof Burn) {
                monster.setStatus(null);
            }
        }
    },
    MINT_BERRY {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Sleep) {
                monster.setStatus(null);
            }
        }
        @Override
        public void battleEffect(Monster monster) {
            if (monster.getStatus() instanceof Sleep) {
                monster.setStatus(null);
            }
        }
    },
    MIRACLE_BERRY {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() != null) {
                monster.setStatus(null);
            }
        }
        @Override
        public void battleEffect(Monster monster) {
            if (monster.getStatus() != null) {
                monster.setStatus(null);
            }
        }
    },
    MYSTERY_BERRY {
        public void effect(Move move) {
            move.setPowerPoints(move.getPowerPoints() + 5);
        }
        @Override
        public void battleEffect(Monster monster) {
            for (Move move : monster.getMoves()) {
                if (move.getPowerPoints() == 0) {
                    move.setPowerPoints(move.getPowerPoints() + 5);
                }
            }
        }
    },
    ;

    public void effect() {}
    public void effect(Monster monster) {}
    public void battleEffect() {}
    public void battleEffect(Monster monster) {}
}

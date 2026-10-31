package io.studentlaptop.monsters.item;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.status.statuses.*;

public enum ItemInfo {
    AMULET_COIN(new Builder()
        .price(100)) {
        @Override
        public void effect() {
            // TODO: program prize money mechanic
        }
    },
    ANTIDOTE(new Builder()
        .price(100)) {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Poison) {
                monster.setStatus(null);
            }
        }
    },
    AWAKENING(new Builder()
        .price(250)) {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Sleep) {
                monster.setStatus(null);
            }
        }
    },
    BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        @Override
        public void effect(Monster monster) {
            monster.setHealth(monster.getHealth() + 10);
        }

        @Override
        public void battleHeldEffect(Monster monster) {
            if (monster.getHealth() <= monster.getSpecies().getBaseHealth() / 2) { // TODO: change right hand condition to monster's max health
                monster.setHealth(monster.getHealth() + 10);
            }
        }
    },
    FIRE_STONE(new Builder()
        .price(2100)) {
        @Override
        public void effect(Monster monster) {
            monster.evolve(this);
        }
    },
    WATER_STONE(new Builder()
        .price(2100)) {
        @Override
        public void effect(Monster monster) {
            monster.evolve(this);
        }
    },
    LIGHTNING_STONE(new Builder()
        .price(2100)) {
        @Override
        public void effect(Monster monster) {
            monster.evolve(this);
        }
    },
    GOLD_BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        @Override
        public void effect(Monster monster) {
            monster.setHealth(monster.getHealth() + 30);
        }
        @Override
        public void battleHeldEffect(Monster monster) {
            if (monster.getHealth() <= monster.getSpecies().getBaseHealth() / 2) { // TODO: change right hand condition to monster's max health
                monster.setHealth(monster.getHealth() + 30);
            }
        }
    },
    ICE_BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Burn) { // TODO: change monster status to a Status object with a parameter for a Statuses Enum
                monster.setStatus(null);
            }
        }
        @Override
        public void battleHeldEffect(Monster monster) {
            if (monster.getStatus() instanceof Burn) {
                monster.setStatus(null);
            }
        }
    },
    MINT_BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Sleep) {
                monster.setStatus(null);
            }
        }
        @Override
        public void battleHeldEffect(Monster monster) {
            if (monster.getStatus() instanceof Sleep) {
                monster.setStatus(null);
            }
        }
    },
    MIRACLE_BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() != null) {
                monster.setStatus(null);
            }
        }
        @Override
        public void battleHeldEffect(Monster monster) {
            if (monster.getStatus() != null) {
                monster.setStatus(null);
            }
        }
    },
    MYSTERY_BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        public void effect(Move move) {
            move.setPowerPoints(move.getPowerPoints() + 5);
        }
        @Override
        public void battleHeldEffect(Monster monster) {
            for (Move move : monster.getMoves()) {
                if (move.getPowerPoints() == 0) {
                    move.setPowerPoints(move.getPowerPoints() + 5);
                }
            }
        }
    },
    BURNT_BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Freeze) {
                monster.setStatus(null);
            }
        }

        @Override
        public void battleHeldEffect(Monster monster) {
            if (monster.getStatus() instanceof Freeze) {
                monster.setStatus(null);
            }
        }
    },
    PRZ_CURE_BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Paralyze) {
                monster.setStatus(null);
            }
        }

        @Override
        public void battleHeldEffect(Monster monster) {
            if (monster.getStatus() instanceof Paralyze) {
                monster.setStatus(null);
            }
        }
    },
    PSN_CURE_BERRY(new Builder()
        .price(10)
        .category(Category.BERRIES)) {
        @Override
        public void effect(Monster monster) {
            if (monster.getStatus() instanceof Poison) {
                monster.setStatus(null);
            }
        }

        @Override
        public void battleHeldEffect(Monster monster) {
            if (monster.getStatus() instanceof Poison) {
                monster.setStatus(null);
            }
        }
    },
    RARE_CANDY(new Builder()
        .price(4800)) {
        public void effect(Monster monster) {
            monster.setLevel(monster.getLevel() + 1);
            monster.evolve();
        }
    },
    ;

    private int price = 0;
    private String texturePath = null;
    private String description = null;
    private Category category = null;

    ItemInfo(Builder builder) {
        this.price = builder.price;
        this.category = builder.category;
        this.texturePath = builder.texturePath;
        this.description = builder.description;
    }

    public void effect() {}
    public void effect(Monster monster) {}
    public void heldEffect(Monster monster) {}
    public void battleEffect() {}
    public void battleEffect(Monster monster) {}
    public void battleHeldEffect(Monster monster) {}

    public int getPrice() {
        return price;
    }

    public String getTexturePath() {
        return texturePath;
    }
    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        if (category == null) {
            return Category.ITEMS;
        }
        return category;
    }

    private static class Builder {
        private int price;
        private Category category;
        private String texturePath;
        private String description;

        private Builder price(int price) {
            this.price = price;
            return this;
        }

        private Builder category(Category category) {
            this.category = category;
            return this;
        }

        private Builder texturePath(String texturePath) {
            this.texturePath = texturePath;
            return this;
        }

        private Builder description(String description) {
            this.description = description;
            return this;
        }

    }

    private enum Category {
        ITEMS,
        KEY_ITEMS,
        POKE_BALLS,
        TM_AND_HM,
        BERRIES,
    }
}

package io.studentlaptop.monsters.item;

import io.studentlaptop.monsters.monster.Monster;

public class Item {
    private ItemInfo info;

    public Item(ItemInfo info) {
        this.info = info;
    }

    public ItemInfo getInfo() {
        return info;
    }

    public void setInfo(ItemInfo info) {
        this.info = info;
    }

    public void use() {}

    public void use(Monster monster) {
        this.info.effect(monster);
    }

    public void useByMonster(Monster monster) {
        this.info.battleEffect(monster);
    }

    @Override
    public String toString() {
        return info.toString();
    }
}

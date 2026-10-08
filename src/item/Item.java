package item;

import monster.Monster;

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
}

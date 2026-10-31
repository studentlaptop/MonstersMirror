package io.studentlaptop.monsters.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemInfoTests {
    @Test
    public void getCategory() {
        assertEquals(ItemInfo.Category.BERRIES, ItemInfo.MINT_BERRY.getCategory());
    }
}

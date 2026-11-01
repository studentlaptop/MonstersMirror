package io.studentlaptop.monsters.item;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemInfoTests {
    @Test
    public void getCategory() {
        assertAll(() ->
                assertEquals(ItemInfo.Category.BERRIES, ItemInfo.MINT_BERRY.getCategory()), () ->
                assertNotNull(ItemInfo.AMULET_COIN.getCategory())
            );
    }

    @Test
    public void getPrice() {
        assertAll(() ->
                assertEquals(10, ItemInfo.MINT_BERRY.getPrice()), () ->
                assertEquals(0, ItemInfo.BROKEN_KEY.getPrice())
            );
    }

    @Test
    public void evolutionItem() {
        Monster eevee = new Monster(SpeciesInfo.EEVEE);
        ItemInfo.FIRE_STONE.effect(eevee);

        assertEquals(SpeciesInfo.FLAREON, eevee.getSpecies());
    }
}

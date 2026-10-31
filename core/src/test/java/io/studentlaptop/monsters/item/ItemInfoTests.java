package io.studentlaptop.monsters.item;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ItemInfoTests {
    @Test
    public void getCategory() {
        assertEquals(ItemInfo.Category.BERRIES, ItemInfo.MINT_BERRY.getCategory());
        assertNotNull(ItemInfo.AMULET_COIN.getCategory());
    }

    @Test
    public void evolutionItem() {
        Monster eevee = new Monster(SpeciesInfo.EEVEE);
        ItemInfo.FIRE_STONE.effect(eevee);

        assertEquals(SpeciesInfo.FLAREON, eevee.getSpecies());
    }
}

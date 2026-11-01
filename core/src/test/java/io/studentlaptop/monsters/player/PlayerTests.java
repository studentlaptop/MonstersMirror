package io.studentlaptop.monsters.player;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTests {
    @Test
    public void TrainerAndSecretID() {
        Player player = new Player("test");

        assertAll(() ->
                //assertNull(PlayerUtils.IDs), () ->
                assertNotEquals(player.getTrainerID(), player.getSecretID())//, () ->
            );
    }

    @Test
    public void Party() {
        Player player = new Player("test");
        Monster eevee = new Monster(SpeciesInfo.EEVEE);
        Monster bulbasaur = new Monster(SpeciesInfo.BULBASAUR);

        player.setEmptySlot(eevee);

        for (int i = 1; i < player.getParty().length; i++) {
            player.setPartySlot(i, bulbasaur);
        }

        player.setEmptySlot(eevee);

        assertAll(() ->
            assertEquals(eevee, player.getParty()[0]), () ->
            assertEquals(bulbasaur, player.getParty()[1]), () ->
            assertNotEquals(eevee, player.getParty()[player.getParty().length - 1])
        );
    }
}

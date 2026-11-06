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
            assertNotNull((Integer) player.getTrainerID()), () ->
            assertNotNull((Integer) player.getSecretID())
        );
    }
}

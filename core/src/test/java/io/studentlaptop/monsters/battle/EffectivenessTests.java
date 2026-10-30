package io.studentlaptop.monsters.battle;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import io.studentlaptop.monsters.monster.move.MoveInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EffectivenessTests {
    @Test
    @DisplayName("Move v. Monster EffectModifier")
    public void getEffectModifier() {
        assertEquals(
            new Effectiveness.EffectModifier(MoveEffect.SUPER_EFFECTIVE, MoveEffect.SUPER_EFFECTIVE.getModifier()),
            Effectiveness.getEffectModifier(MoveInfo.EMBER.create(), new Monster(SpeciesInfo.BULBASAUR)));
    }
}

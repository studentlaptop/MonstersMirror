package io.studentlaptop.monsters.battle;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.move.MoveInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.studentlaptop.monsters.battle.MoveEffect.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EffectivenessTests {
    Effectiveness.EffectModifier noEffect =  new Effectiveness.EffectModifier(NO_EFFECT, NO_EFFECT.modifier);
    Effectiveness.EffectModifier notEffective = new Effectiveness.EffectModifier(NOT_EFFECTIVE, NOT_EFFECTIVE.modifier);
    Effectiveness.EffectModifier effective = new Effectiveness.EffectModifier(EFFECTIVE, EFFECTIVE.modifier);
    Effectiveness.EffectModifier superEffective = new Effectiveness.EffectModifier(SUPER_EFFECTIVE, SUPER_EFFECTIVE.modifier);
    Effectiveness.EffectModifier doubleNotEffective = new Effectiveness.EffectModifier(NOT_EFFECTIVE, NOT_EFFECTIVE.modifier * NOT_EFFECTIVE.modifier);
    Effectiveness.EffectModifier doubleSuperEffective = new Effectiveness.EffectModifier(SUPER_EFFECTIVE, SUPER_EFFECTIVE.modifier * SUPER_EFFECTIVE.modifier);

    Move fireMove = new Move(MoveInfo.EMBER);
    Move grassMove = new Move(MoveInfo.ABSORB);
    Move normalMove = new Move(MoveInfo.TACKLE);
    Move rockMove = new Move(MoveInfo.ROCK_SLIDE);

    Monster bugFlyingMonster = new Monster(SpeciesInfo.BUTTERFREE);
    Monster ghostMonster = new Monster(SpeciesInfo.GASTLY);
    Monster grassMonster = new Monster(SpeciesInfo.BULBASAUR);
    Monster rockMonster = new Monster(SpeciesInfo.KABUTO);

    @Test
    @DisplayName("Move v. Monster EffectModifier")
    public void getEffectModifier() {
        assertAll(() ->
                assertEquals(noEffect, Effectiveness.getEffectModifier(normalMove, ghostMonster)), () ->
                assertEquals(notEffective, Effectiveness.getEffectModifier(normalMove, rockMonster)), () ->
                assertEquals(superEffective, Effectiveness.getEffectModifier(fireMove, grassMonster)), () ->
                assertEquals(effective, Effectiveness.getEffectModifier(normalMove, grassMonster)), () ->
                assertEquals(doubleNotEffective, Effectiveness.getEffectModifier(grassMove, bugFlyingMonster)), () ->
                assertEquals(doubleSuperEffective, Effectiveness.getEffectModifier(rockMove, bugFlyingMonster))
            );
    }
}

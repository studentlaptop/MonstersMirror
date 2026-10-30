package io.studentlaptop.monsters.battle;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.move.MoveInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.studentlaptop.monsters.battle.MoveEffect.*;
import static io.studentlaptop.monsters.battle.MoveEffect.SUPER_EFFECTIVE;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EffectivenessTests {
    Effectiveness.EffectModifier noEffect =  new Effectiveness.EffectModifier(NO_EFFECT, NO_EFFECT.getModifier());
    Effectiveness.EffectModifier notEffective = new Effectiveness.EffectModifier(NOT_EFFECTIVE, NOT_EFFECTIVE.getModifier());
    Effectiveness.EffectModifier effective = new Effectiveness.EffectModifier(EFFECTIVE, EFFECTIVE.getModifier());
    Effectiveness.EffectModifier superEffective = new Effectiveness.EffectModifier(SUPER_EFFECTIVE, SUPER_EFFECTIVE.getModifier());
    Effectiveness.EffectModifier doubleNotEffective = new Effectiveness.EffectModifier(NOT_EFFECTIVE, NOT_EFFECTIVE.getModifier() * NOT_EFFECTIVE.getModifier());
    Effectiveness.EffectModifier doubleSuperEffective = new Effectiveness.EffectModifier(SUPER_EFFECTIVE, SUPER_EFFECTIVE.getModifier() * SUPER_EFFECTIVE.getModifier());

    Move fireMove = MoveInfo.EMBER.create();
    Move grassMove = MoveInfo.ABSORB.create();
    Move normalMove = MoveInfo.TACKLE.create();
    Move rockMove = MoveInfo.ROCK_SLIDE.create();

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

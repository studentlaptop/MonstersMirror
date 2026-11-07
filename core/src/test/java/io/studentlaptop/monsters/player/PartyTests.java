package io.studentlaptop.monsters.player;

import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PartyTests {
    @Test
    public void GetSetAndAddTo() {
        Player player = new Player("test");
        Monster eevee = new Monster(SpeciesInfo.EEVEE);
        Monster bulbasaur = new Monster(SpeciesInfo.BULBASAUR);

        player.getParty().addFirst(eevee);

        for (int i = 1; i < player.getParty().size(); i++) {
            player.getParty().set(i, bulbasaur);
        }

        // attempt to add a Monster to a party with no null elements which shouldn't work
        player.getParty().addLast(eevee);

        assertAll(() ->
            assertEquals(eevee, player.getParty().getFirst()), () ->
            assertEquals(bulbasaur, player.getParty().get(1)), () ->
            assertNotEquals(eevee, player.getParty().getLast())
        );
    }

    @Test
    public void RemoveFromAndClear() {
        Player player = new Player("test");
        Monster eevee = new Monster(SpeciesInfo.EEVEE);

        player.getParty().add(eevee);
        player.getParty().add(eevee);

        assertAll(() ->
            assertNull(player.getParty().removeFirst())
        );
    }

    @Test
    public void IndexOfAndContains() {
        Player player = new Player("test");
        Monster eevee = new Monster(SpeciesInfo.EEVEE);
        Monster bulbasaur = new Monster(SpeciesInfo.BULBASAUR);

        // eevee added to party while rest of party is null
        player.getParty().add(eevee);

        assertAll(() ->
            assertDoesNotThrow(() -> player.getParty().indexOf(eevee)), () ->
            assertDoesNotThrow(() -> player.getParty().contains(eevee)), () ->
            assertDoesNotThrow(() -> player.getParty().indexOf(bulbasaur)), () ->
            assertDoesNotThrow(() -> player.getParty().contains(bulbasaur)), () ->
            assertDoesNotThrow(() -> player.getParty().indexOf(null)), () ->
            assertDoesNotThrow(() -> player.getParty().contains(null)), () ->
            assertThrows(ClassCastException.class, () -> player.getParty().indexOf("eevee")), () ->
            assertThrows(ClassCastException.class, () -> player.getParty().contains("null"))
        );
    }

    @Test
    public void givenCollection_whenNewPartyWithCollection_thenAssertPartyIsInitialized() {
        Monster eevee = new Monster(SpeciesInfo.EEVEE);

        Party party = new Party();
        party.add(eevee);

        Party partyByPartyObj = new Party(party);
        Party partyByArray = new Party(List.of(new Monster[]{eevee}));

        Collection<Monster> c = new ArrayList<>();
        c.add(eevee);
        Party partyByCollection = new Party(c);

        Collection<Monster> emptyC = new ArrayList<>();
        Party partyByEmptyCollection = new Party(emptyC);

        assertAll(() ->
            assertEquals(party, partyByPartyObj), () ->
            assertEquals(party, partyByArray), () ->
            assertEquals(partyByPartyObj, partyByCollection), () ->
            assertEquals(new Party(), partyByEmptyCollection)
        );
    }

    @Test
    public void givenBuilder_whenNewPartyWithBuilder_thenAssertPartyIsInitialized() {
        Monster eevee = new Monster(SpeciesInfo.EEVEE);
        Party party = new Party(List.of(eevee));
        Party partyByBuilder = new Party.Builder().first(eevee).build();

        assertAll(() ->
            assertNotNull(partyByBuilder), () ->
            assertEquals (party, partyByBuilder)
        );
    }
}

package monster.monsters;

import monster.Type;
import monster.Typing;

import java.util.HashMap;
import java.util.Map;

public enum SpeciesInfo {
    BULBASAUR(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    )
    ,
    IVYSAUR(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    ),
    VENUSAUR(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    ),
    CHARMANDER(new Builder()
            .setTyping(Type.FIRE)
    ),
    CHARMELEON(new Builder()
            .setTyping(Type.FIRE)
    ),
    CHARIZARD(new Builder()
            .setTyping(Type.FIRE, Type.FLYING)
    ),
    SQUIRTLE(new Builder()
            .setTyping(Type.WATER)
    ),
    WARTORTLE(new Builder()
            .setTyping(Type.WATER)
    ),
    BLASTOISE(new Builder()
            .setTyping(Type.WATER)
    ),
    CATERPIE(new Builder()
            .setTyping(Type.BUG)
    ),
    METAPOD(new Builder()
            .setTyping(Type.BUG)
    ),
    BUTTERFREE(new Builder()
            .setTyping(Type.BUG, Type.FLYING)
    ),
    WEEDLE(new Builder()
            .setTyping(Type.BUG, Type.POISON)
    ),
    KAKUNA(new Builder()
            .setTyping(Type.BUG, Type.POISON)
    ),
    BEEDRILL(new Builder()
            .setTyping(Type.BUG, Type.POISON)
    ),
    PIDGEY(new Builder()
            .setTyping(Type.NORMAL, Type.FLYING)
    ),
    PIDGEOTTO(new Builder()
            .setTyping(Type.NORMAL, Type.FLYING)
    ),
    PIDGEOT(new Builder()
            .setTyping(Type.NORMAL, Type.FLYING)
    ),
    RATTATA(new Builder()
            .setTyping(Type.NORMAL)
    ),
    RATICATE(new Builder()
            .setTyping(Type.NORMAL)
    ),
    SPEAROW(new Builder()
            .setTyping(Type.NORMAL, Type.FLYING)
    ),
    FEAROW(new Builder()
            .setTyping(Type.NORMAL, Type.FLYING)
    ),
    EKANS(new Builder()
            .setTyping(Type.POISON)
    ),
    ARBOK(new Builder()
            .setTyping(Type.POISON)
    ),
    PIKACHU(new Builder()
            .setTyping(Type.ELECTRIC)
    ),
    RAICHU(new Builder()
            .setTyping(Type.ELECTRIC)
    ),
    SANDSHREW(new Builder()
            .setTyping(Type.GROUND)
    ),
    SANDSLASH(new Builder()
            .setTyping(Type.GROUND)
    ),
    NIDORAN_FEMALE(new Builder()
            .setTyping(Type.POISON)
    ),
    NIDORINA(new Builder()
            .setTyping(Type.POISON)
    ),
    NIDOQUEEN(new Builder()
            .setTyping(Type.POISON, Type.GROUND)
    ),
    NIDORAN_MALE(new Builder()
            .setTyping(Type.POISON)
    ),
    NIDORINO(new Builder()
            .setTyping(Type.POISON)
    ),
    NIDOKING(new Builder()
            .setTyping(Type.POISON, Type.GROUND)
    ),
    CLEFAIRY(new Builder()
            .setTyping(Type.NORMAL)
    ),
    CLEFABLE(new Builder()
            .setTyping(Type.NORMAL)
    ),
    VULPIX(new Builder()
            .setTyping(Type.FIRE)
    ),
    NINETALES(new Builder()
            .setTyping(Type.FIRE)
    ),
    JIGGLYPUFF(new Builder()
            .setTyping(Type.NORMAL)
    ),
    WIGGLYTUFF(new Builder()
            .setTyping(Type.NORMAL)
    ),
    ZUBAT(new Builder()
            .setTyping(Type.POISON, Type.FLYING)
    ),
    GOLBAT(new Builder()
            .setTyping(Type.POISON, Type.FLYING)
    ),
    ODDISH(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    ),
    GLOOM(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    ),
    VILEPLUME(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    ),
    PARAS(new Builder()
            .setTyping(Type.BUG, Type.POISON)
    ),
    PARASECT(new Builder()
            .setTyping(Type.BUG, Type.POISON)
    ),
    VENONAT(new Builder()
            .setTyping(Type.BUG, Type.POISON)
    ),
    VENOMOTH(new Builder()
            .setTyping(Type.BUG, Type.POISON)
    ),
    DIGLETT(new Builder()
            .setTyping(Type.GROUND)
    ),
    DUGTRIO(new Builder()
            .setTyping(Type.GROUND)
    ),
    MEOWTH(new Builder()
            .setTyping(Type.NORMAL)
    ),
    PERSIAN(new Builder()
            .setTyping(Type.NORMAL)
    ),
    PSYDUCK(new Builder()
            .setTyping(Type.WATER)
    ),
    GOLDUCK(new Builder()
            .setTyping(Type.WATER)
    ),
    MANKEY(new Builder()
            .setTyping(Type.FIGHTING)
    ),
    PRIMEAPE(new Builder()
            .setTyping(Type.FIGHTING)
    ),
    GROWLITHE(new Builder()
            .setTyping(Type.FIRE)
    ),
    ARCANINE(new Builder()
            .setTyping(Type.FIRE)
    ),
    POLIWAG(new Builder()
            .setTyping(Type.WATER)
    ),
    POLIWHIRL(new Builder()
            .setTyping(Type.WATER)
    ),
    POLIWRATH(new Builder()
            .setTyping(Type.WATER, Type.FIGHTING)
    ),
    ABRA(new Builder()
            .setTyping(Type.PSYCHIC)
    ),
    KADABRA(new Builder()
            .setTyping(Type.PSYCHIC)
    ),
    ALAKAZAM(new Builder()
            .setTyping(Type.PSYCHIC)
    ),
    MACHOP(new Builder()
            .setTyping(Type.FIGHTING)
    ),
    MACHOKE(new Builder()
            .setTyping(Type.FIGHTING)
    ),
    MACHAMP(new Builder()
            .setTyping(Type.FIGHTING)
    ),
    BELLSPROUT(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    ),
    WEEPINBELL(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    ),
    VICTREEBEL(new Builder()
            .setTyping(Type.GRASS, Type.POISON)
    ),
    TENTACOOL(new Builder()
            .setTyping(Type.WATER, Type.POISON)
    ),
    TENTACRUEL(new Builder()
            .setTyping(Type.WATER, Type.POISON)
    ),
    GEODUDE(new Builder()
            .setTyping(Type.ROCK, Type.GROUND)
    ),
    GRAVELER(new Builder()
            .setTyping(Type.ROCK, Type.GROUND)
    ),
    GOLEM(new Builder()
            .setTyping(Type.ROCK, Type.GROUND)
    ),
    PONYTA(new Builder()
            .setTyping(Type.FIRE)
    ),
    RAPIDASH(new Builder()
            .setTyping(Type.FIRE)
    ),
    SLOWPOKE(new Builder()
            .setTyping(Type.WATER, Type.PSYCHIC)
    ),
    SLOWBRO(new Builder()
            .setTyping(Type.WATER, Type.PSYCHIC)
    ),
    MAGNEMITE(new Builder()
            .setTyping(Type.ELECTRIC)
    ),
    MAGNETON(new Builder()
            .setTyping(Type.ELECTRIC)
    ),
    FARFETCH_D(new Builder()
            .setTyping(Type.NORMAL, Type.FLYING)
    ),
    DODUO(new Builder()
            .setTyping(Type.NORMAL, Type.FLYING)
    ),
    DODRIO(new Builder()
            .setTyping(Type.NORMAL, Type.FLYING)
    ),
    SEEL(new Builder()
            .setTyping(Type.WATER)
    ),
    DEWGONG(new Builder()
            .setTyping(Type.WATER, Type.ICE)
    ),
    GRIMER(new Builder()
            .setTyping(Type.POISON)
    ),
    MUK(new Builder()
            .setTyping(Type.POISON)
    ),
    SHELLDER(new Builder()
            .setTyping(Type.WATER)
    ),
    CLOYSTER(new Builder()
            .setTyping(Type.WATER, Type.ICE)
    ),
    GASTLY(new Builder()
            .setTyping(Type.GHOST, Type.POISON)
    ),
    HAUNTER(new Builder()
            .setTyping(Type.GHOST, Type.POISON)
    ),
    GENGAR(new Builder()
            .setTyping(Type.GHOST, Type.POISON)
    ),
    ONIX(new Builder()
            .setTyping(Type.ROCK, Type.GROUND)
    ),
    DROWZEE(new Builder()
            .setTyping(Type.PSYCHIC)
    ),
    HYPNO(new Builder()
            .setTyping(Type.PSYCHIC)
    ),
    KRABBY(new Builder()
            .setTyping(Type.WATER)
    ),
    KINGLER(new Builder()
            .setTyping(Type.WATER)
    ),
    VOLTORB(new Builder()
            .setTyping(Type.ELECTRIC)
    ),
    ELECTRODE(new Builder()
            .setTyping(Type.ELECTRIC)
    ),
    EXEGGCUTE(new Builder()
            .setTyping(Type.GRASS, Type.PSYCHIC)
    ),
    EXEGGUTOR(new Builder()
            .setTyping(Type.GRASS, Type.PSYCHIC)
    ),
    CUBONE(new Builder()
            .setTyping(Type.GROUND)
    ),
    MAROWAK(new Builder()
            .setTyping(Type.GROUND)
    ),
    HITMONLEE(new Builder()
            .setTyping(Type.FIGHTING)
    ),
    HITMONCHAN(new Builder()
            .setTyping(Type.FIGHTING)
    ),
    LICKITUNG(new Builder()
            .setTyping(Type.NORMAL)
    ),
    KOFFING(new Builder()
            .setTyping(Type.POISON)
    ),
    WEEZING(new Builder()
            .setTyping(Type.POISON)
    ),
    RHYHORN(new Builder()
            .setTyping(Type.GROUND, Type.ROCK)
    ),
    RHYDON(new Builder()
            .setTyping(Type.GROUND, Type.ROCK)
    ),
    CHANSEY(new Builder()
            .setTyping(Type.NORMAL)
    ),
    TANGELA(new Builder()
            .setTyping(Type.GRASS)
    ),
    KANGASKHAN(new Builder()
            .setTyping(Type.NORMAL)
    ),
    HORSEA(new Builder()
            .setTyping(Type.WATER)
    ),
    SEADRA(new Builder()
            .setTyping(Type.WATER)
    ),
    GOLDEEN(new Builder()
            .setTyping(Type.WATER)
    ),
    SEAKING(new Builder()
            .setTyping(Type.WATER)
    ),
    STARYU(new Builder()
            .setTyping(Type.WATER)
    ),
    STARMIE(new Builder()
            .setTyping(Type.WATER, Type.PSYCHIC)
    ),
    MR_MIME(new Builder()
            .setTyping(Type.PSYCHIC)
    ),
    SCYTHER(new Builder()
            .setTyping(Type.BUG, Type.FLYING)
    ),
    JYNX(new Builder()
            .setTyping(Type.ICE, Type.PSYCHIC)
    ),
    ELECTABUZZ(new Builder()
            .setTyping(Type.ELECTRIC)
    ),
    MAGMAR(new Builder()
            .setTyping(Type.FIRE)
    ),
    PINSIR(new Builder()
            .setTyping(Type.BUG)
    ),
    TAUROS(new Builder()
            .setTyping(Type.NORMAL)
    ),
    MAGIKARP(new Builder()
            .setTyping(Type.WATER)
    ),
    GYARADOS(new Builder()
            .setTyping(Type.WATER, Type.FLYING)
    ),
    LAPRAS(new Builder()
            .setTyping(Type.WATER, Type.ICE)
    ),
    DITTO(new Builder()
            .setTyping(Type.NORMAL)
    ),
    EEVEE(new Builder()
            .setTyping(Type.NORMAL)
    ),
    VAPOREON(new Builder()
            .setTyping(Type.WATER)
    ),
    JOLTEON(new Builder()
            .setTyping(Type.ELECTRIC)
    ),
    FLAREON(new Builder()
            .setTyping(Type.FIRE)
    ),
    PORYGON(new Builder()
            .setTyping(Type.NORMAL)
    ),
    OMANYTE(new Builder()
            .setTyping(Type.ROCK, Type.WATER)
    ),
    OMASTAR(new Builder()
            .setTyping(Type.ROCK, Type.WATER)
    ),
    KABUTO(new Builder()
            .setTyping(Type.ROCK, Type.WATER)
    ),
    KABUTOPS(new Builder()
            .setTyping(Type.ROCK, Type.WATER)
    ),
    AERODACTYL(new Builder()
            .setTyping(Type.ROCK, Type.FLYING)
    ),
    SNORLAX(new Builder()
            .setTyping(Type.NORMAL)
    ),
    ARTICUNO(new Builder()
            .setTyping(Type.ICE, Type.FLYING)
    ),
    ZAPDOS(new Builder()
            .setTyping(Type.ELECTRIC, Type.FLYING)
    ),
    MOLTRES(new Builder()
            .setTyping(Type.FIRE, Type.FLYING)
    ),
    DRATINI(new Builder()
            .setTyping(Type.DRAGON)
    ),
    DRAGONAIR(new Builder()
            .setTyping(Type.DRAGON)
    ),
    DRAGONITE(new Builder()
            .setTyping(Type.DRAGON, Type.FLYING)
    ),
    MEWTWO(new Builder()
            .setTyping(Type.PSYCHIC)
    ),
    MEW(new Builder()
            .setTyping(Type.PSYCHIC)
    ),
    ;

    private final Typing typing;

    SpeciesInfo(Builder builder) {
        this.typing = builder.typing;
    }

    public Typing getTyping() {
        return typing;
    }

    public int getDexNum() {
        return ordinal() + 1;
    }

    private static class Builder {
        private Typing typing;

        public Builder setTyping(Type type) {
            this.typing = new Typing(new Type[]{type});
            return this;
        }

        public Builder setTyping(Type firstType, Type secondType) {
            this.typing = new Typing(new Type[]{firstType, secondType});
            return this;
        }
    }
}
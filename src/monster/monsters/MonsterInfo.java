package monster.monsters;

import monster.Type;
import monster.Typing;

public enum MonsterInfo {
    BULBASAUR(Bulbasaur.class, new Typing(new Type[]{Type.GRASS, Type.POISON})) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.uniqueTyping;
        }
    },
    IVYSAUR(Ivysaur.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    VENUSAUR(Venusaur.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    CHARMANDER(Charmander.class, new Typing(new Type[]{Type.FIRE})) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.uniqueTyping;
        }
    },
    CHARMELEON(Charmeleon.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    CHARIZARD(Charizard.class, new Typing(new Type[]{Type.FIRE, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return CHARIZARD.uniqueTyping;
        }
    },
    SQUIRTLE(Squirtle.class, new Typing(new Type[]{Type.WATER})) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.uniqueTyping;
        }
    },
    WARTORTLE(Wartortle.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    BLASTOISE(Blastoise.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    CATERPIE(Caterpie.class, new Typing(new Type[]{Type.BUG})) {
        @Override
        Typing getMonsterTyping() {
            return CATERPIE.uniqueTyping;
        }
    },
    METAPOD(Metapod.class) {
        @Override
        Typing getMonsterTyping() {
            return CATERPIE.getMonsterTyping();
        }
    },
    BUTTERFREE(Butterfree.class, new Typing(new Type[]{Type.BUG, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return BUTTERFREE.uniqueTyping;
        }
    },
    WEEDLE(Weedle.class, new Typing(new Type[]{Type.BUG, Type.POISON})) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.uniqueTyping;
        }
    },
    KAKUNA(Kakuna.class) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.getMonsterTyping();
        }
    },
    BEEDRILL(Beedrill.class) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.getMonsterTyping();
        }
    },
    PIDGEY(Pidgey.class, new Typing(new Type[]{Type.NORMAL, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.uniqueTyping;
        }
    },
    PIDGEOTTO(Pidgeotto.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    PIDGEOT(Pidgeot.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    RATTATA(Rattata.class, new Typing(new Type[]{Type.NORMAL})) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.uniqueTyping;
        }
    },
    RATICATE(Raticate.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    SPEAROW(Spearow.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    FEAROW(Fearow.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    EKANS(Ekans.class, new Typing(new Type[]{Type.POISON})) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.uniqueTyping;
        }
    },
    ARBOK(Arbok.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    PIKACHU(Pikachu.class, new Typing(new Type[]{Type.ELECTRIC})) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.uniqueTyping;
        }
    },
    RAICHU(Raichu.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    SANDSHREW(Sandshrew.class, new Typing(new Type[]{Type.GROUND})) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.uniqueTyping;
        }
    },
    SANDSLASH(Sandslash.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    NIDORAN_FEMALE(NidoranFemale.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    NIDORINA(Nidorina.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    NIDOQUEEN(Nidoqueen.class, new Typing(new Type[]{Type.POISON, Type.GROUND})) {
        @Override
        Typing getMonsterTyping() {
            return NIDOQUEEN.uniqueTyping;
        }
    },
    NIDORAN_MALE(NidoranMale.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    NIDORINO(Nidorino.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    NIDOKING(Nidoking.class) {
        @Override
        Typing getMonsterTyping() {
            return NIDOQUEEN.getMonsterTyping();
        }
    },
    CLEFAIRY(Clefairy.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    CLEFABLE(Clefable.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    VULPIX(Vulpix.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    NINETALES(Ninetales.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    JIGGLYPUFF(Jigglypuff.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    WIGGLYTUFF(Wigglytuff.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    ZUBAT(Zubat.class, new Typing(new Type[]{Type.POISON, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return ZUBAT.uniqueTyping;
        }
    },
    GOLBAT(Golbat.class) {
        @Override
        Typing getMonsterTyping() {
            return ZUBAT.getMonsterTyping();
        }
    },
    ODDISH(Oddish.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    GLOOM(Gloom.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    VILEPLUME(Vileplume.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    PARAS(Paras.class, new Typing(new Type[]{Type.BUG, Type.POISON})) {
        @Override
        Typing getMonsterTyping() {
            return PARAS.uniqueTyping;
        }
    },
    PARASECT(Parasect.class) {
        @Override
        Typing getMonsterTyping() {
            return PARAS.getMonsterTyping();
        }
    },
    VENONAT(Venonat.class) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.getMonsterTyping();
        }
    },
    VENOMOTH(Venomoth.class) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.getMonsterTyping();
        }
    },
    DIGLETT(Diglett.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    DUGTRIO(Dugtrio.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    MEOWTH(Meowth.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    PERSIAN(Persian.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    PSYDUCK(Psyduck.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    GOLDUCK(Golduck.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    MANKEY(Mankey.class, new Typing(new Type[]{Type.FIGHTING})) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.uniqueTyping;
        }
    },
    PRIMEAPE(Primeape.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    GROWLITHE(Growlithe.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    ARCANINE(Arcanine.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    POLIWAG(Poliwag.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    POLIWHIRL(Poliwhirl.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    POLIWRATH(Poliwrath.class, new Typing(new Type[]{Type.WATER, Type.FIGHTING})) {
        @Override
        Typing getMonsterTyping() {
            return POLIWRATH.uniqueTyping;
        }
    },
    ABRA(Abra.class, new Typing(new Type[]{Type.PSYCHIC})) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.uniqueTyping;
        }
    },
    KADABRA(Kadabra.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    ALAKAZAM(Alakazam.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    MACHOP(Machop.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    MACHOKE(Machoke.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    MACHAMP(Machamp.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    BELLSPROUT(Bellsprout.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    WEEPINBELL(Weepinbell.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    VICTREEBEL(Victreebel.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    TENTACOOL(Tentacool.class, new Typing(new Type[]{Type.WATER, Type.POISON})) {
        @Override
        Typing getMonsterTyping() {
            return TENTACOOL.uniqueTyping;
        }
    },
    TENTACRUEL(Tentacruel.class) {
        @Override
        Typing getMonsterTyping() {
            return TENTACOOL.getMonsterTyping();
        }
    },
    GEODUDE(Geodude.class, new Typing(new Type[]{Type.ROCK, Type.GROUND})) {
        @Override
        Typing getMonsterTyping() {
            return GEODUDE.uniqueTyping;
        }
    },
    GRAVELER(Graveler.class) {
        @Override
        Typing getMonsterTyping() {
            return GEODUDE.getMonsterTyping();
        }
    },
    GOLEM(Golem.class) {
        @Override
        Typing getMonsterTyping() {
            return GEODUDE.getMonsterTyping();
        }
    },
    PONYTA(Ponyta.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    RAPIDASH(Rapidash.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    SLOWPOKE(Slowpoke.class, new Typing(new Type[]{Type.WATER, Type.PSYCHIC})) {
        @Override
        Typing getMonsterTyping() {
            return SLOWPOKE.uniqueTyping;
        }
    },
    SLOWBRO(Slowbro.class) {
        @Override
        Typing getMonsterTyping() {
            return SLOWPOKE.getMonsterTyping();
        }
    },
    MAGNEMITE(Magnemite.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    MAGNETON(Magneton.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    FARFETCH_D(Farfetchd.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    DODUO(Doduo.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    DODRIO(Dodrio.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    SEEL(Seel.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    DEWGONG(Dewgong.class, new Typing(new Type[]{Type.WATER, Type.ICE})) {
        @Override
        Typing getMonsterTyping() {
            return DEWGONG.uniqueTyping;
        }
    },
    GRIMER(Grimer.class, new Typing(new Type[]{Type.POISON})) {
        @Override
        Typing getMonsterTyping() {
            return GRIMER.uniqueTyping;
        }
    },
    MUK(Muk.class) {
        @Override
        Typing getMonsterTyping() {
            return GRIMER.getMonsterTyping();
        }
    },
    SHELLDER(Shellder.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    CLOYSTER(Cloyster.class) {
        @Override
        Typing getMonsterTyping() {
            return DEWGONG.getMonsterTyping();
        }
    },
    GASTLY(Gastly.class, new Typing(new Type[]{Type.GHOST, Type.POISON})) {
        @Override
        Typing getMonsterTyping() {
            return GASTLY.uniqueTyping;
        }
    },
    HAUNTER(Haunter.class) {
        @Override
        Typing getMonsterTyping() {
            return GASTLY.getMonsterTyping();
        }
    },
    GENGAR(Gengar.class) {
        @Override
        Typing getMonsterTyping() {
            return GASTLY.getMonsterTyping();
        }
    },
    ONIX(Onix.class) {
        @Override
        Typing getMonsterTyping() {
            return GEODUDE.getMonsterTyping();
        }
    },
    DROWZEE(Drowzee.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    HYPNO(Hypno.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    KRABBY(Krabby.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    KINGLER(Kingler.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    VOLTORB(Voltorb.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    ELECTRODE(Electrode.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    EXEGGCUTE(Exeggcute.class, new Typing(new Type[]{Type.GRASS, Type.PSYCHIC})) {
        @Override
        Typing getMonsterTyping() {
            return EXEGGCUTE.uniqueTyping;
        }
    },
    EXEGGUTOR(Exeggutor.class) {
        @Override
        Typing getMonsterTyping() {
            return EXEGGCUTE.getMonsterTyping();
        }
    },
    CUBONE(Cubone.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    MAROWAK(Marowak.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    HITMONLEE(Hitmonlee.class) {
        @Override
        Typing getMonsterTyping() {
            return MAROWAK.getMonsterTyping();
        }
    },
    HITMONCHAN(Hitmonchan.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    LICKITUNG(Lickitung.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    KOFFING(Koffing.class) {
        @Override
        Typing getMonsterTyping() {
            return GRIMER.getMonsterTyping();
        }
    },
    WEEZING(Weezing.class) {
        @Override
        Typing getMonsterTyping() {
            return GRIMER.getMonsterTyping();
        }
    },
    RHYHORN(Rhyhorn.class, new Typing(new Type[]{Type.GROUND, Type.ROCK})) {
        @Override
        Typing getMonsterTyping() {
            return RHYHORN.uniqueTyping;
        }
    },
    RHYDON(Rhydon.class) {
        @Override
        Typing getMonsterTyping() {
            return RHYHORN.getMonsterTyping();
        }
    },
    CHANSEY(Chansey.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    TANGELA(Tangela.class, new Typing(new Type[]{Type.GRASS})) {
        @Override
        Typing getMonsterTyping() {
            return TANGELA.uniqueTyping;
        }
    },
    KANGASKHAN(Kangaskhan.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    HORSEA(Horsea.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    SEADRA(Seadra.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    GOLDEEN(Goldeen.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    SEAKING(Seaking.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    STARYU(Staryu.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    STARMIE(Starmie.class) {
        @Override
        Typing getMonsterTyping() {
            return SLOWPOKE.getMonsterTyping();
        }
    },
    MR_MIME(MrMime.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    SCYTHER(Scyther.class) {
        @Override
        Typing getMonsterTyping() {
            return BUTTERFREE.getMonsterTyping();
        }
    },
    JYNX(Jynx.class, new Typing(new Type[]{Type.ICE, Type.PSYCHIC})) {
        @Override
        Typing getMonsterTyping() {
            return JYNX.uniqueTyping;
        }
    },
    ELECTABUZZ(Electabuzz.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    MAGMAR(Magmar.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    PINSIR(Pinsir.class) {
        @Override
        Typing getMonsterTyping() {
            return CATERPIE.getMonsterTyping();
        }
    },
    TAUROS(Tauros.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    MAGIKARP(Magikarp.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    GYARADOS(Gyarados.class, new Typing(new Type[]{Type.WATER, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return GYARADOS.uniqueTyping;
        }
    },
    LAPRAS(Lapras.class) {
        @Override
        Typing getMonsterTyping() {
            return DEWGONG.getMonsterTyping();
        }
    },
    DITTO(Ditto.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    EEVEE(Eevee.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    VAPOREON(Vaporeon.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    JOLTEON(Jolteon.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    FLAREON(Flareon.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    PORYGON(Porygon.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    OMANYTE(Omanyte.class, new Typing(new Type[]{Type.ROCK, Type.WATER})) {
        @Override
        Typing getMonsterTyping() {
            return OMANYTE.uniqueTyping;
        }
    },
    OMASTAR(Omastar.class) {
        @Override
        Typing getMonsterTyping() {
            return OMANYTE.getMonsterTyping();
        }
    },
    KABUTO(Kabuto.class) {
        @Override
        Typing getMonsterTyping() {
            return OMANYTE.getMonsterTyping();
        }
    },
    KABUTOPS(Kabutops.class) {
        @Override
        Typing getMonsterTyping() {
            return OMANYTE.getMonsterTyping();
        }
    },
    AERODACTYL(Aerodactyl.class, new Typing(new Type[]{Type.ROCK, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return AERODACTYL.uniqueTyping;
        }
    },
    SNORLAX(Snorlax.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    ARTICUNO(Articuno.class, new Typing(new Type[]{Type.ICE, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return ARTICUNO.uniqueTyping;
        }
    },
    ZAPDOS(Zapdos.class, new Typing(new Type[]{Type.ELECTRIC, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return ZAPDOS.uniqueTyping;
        }
    },
    MOLTRES(Moltres.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARIZARD.getMonsterTyping();
        }
    },
    DRATINI(Dratini.class, new Typing(new Type[]{Type.DRAGON})) {
        @Override
        Typing getMonsterTyping() {
            return DRATINI.uniqueTyping;
        }
    },
    DRAGONAIR(Dragonair.class) {
        @Override
        Typing getMonsterTyping() {
            return DRATINI.getMonsterTyping();
        }
    },
    DRAGONITE(Dragonite.class, new Typing(new Type[]{Type.DRAGON, Type.FLYING})) {
        @Override
        Typing getMonsterTyping() {
            return DRAGONITE.uniqueTyping;
        }
    },
    MEWTWO(Mewtwo.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    MEW(Mew.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    ;

    private final Class<?> monsterClass;
    private Typing uniqueTyping;
    private static final MonsterInfo[] enums = values();
    abstract Typing getMonsterTyping();

    MonsterInfo(Class<?> monsterClass) {
        this.monsterClass = monsterClass;
    }

    MonsterInfo(Class<?> monsterClass, Typing uniqueTyping) {
        this.monsterClass = monsterClass;
        this.uniqueTyping = uniqueTyping;
    }

    public static int getDexNum(Class<?> monsterClass) {
        for (MonsterInfo monster : enums) {
            if (monster.monsterClass.equals(monsterClass)) {
                return monster.ordinal() + 1;
            }
        }
        throw new IllegalArgumentException("Monster class " + monsterClass.getName() + " not found");
    }

    public static Typing getTyping(Class<?> monsterClass) {
        for (MonsterInfo monster : enums) {
            if (monster.monsterClass.equals(monsterClass)) {
                return monster.getMonsterTyping();
            }
        }
        throw new IllegalArgumentException("Monster class " + monsterClass.getName() + " not found");
    }
}
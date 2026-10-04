package monster.monsters;

import monster.Type;
import monster.Typing;

public enum MonsterInfo {
    BULBASAUR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.GRASS, Type.POISON});
        }
    },
    IVYSAUR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    VENUSAUR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    CHARMANDER(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.FIRE});
        }
    },
    CHARMELEON(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    CHARIZARD(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.FIRE, Type.FLYING});
        }
    },
    SQUIRTLE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.WATER});
        }
    },
    WARTORTLE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    BLASTOISE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    CATERPIE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.BUG});
        }
    },
    METAPOD(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CATERPIE.getMonsterTyping();
        }
    },
    BUTTERFREE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new  Typing(new Type[]{Type.BUG, Type.FLYING});
        }
    },
    WEEDLE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.BUG, Type.POISON});
        }
    },
    KAKUNA(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.getMonsterTyping();
        }
    },
    BEEDRILL(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.getMonsterTyping();
        }
    },
    PIDGEY(Pidgey.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.NORMAL, Type.FLYING});
        }
    },
    PIDGEOTTO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    PIDGEOT(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    RATTATA(Rattata.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.NORMAL});
        }
    },
    RATICATE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    SPEAROW(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    FEAROW(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    EKANS(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.POISON});
        }
    },
    ARBOK(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    PIKACHU(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.ELECTRIC});
        }
    },
    RAICHU(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    SANDSHREW(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.GROUND});
        }
    },
    SANDSLASH(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    NIDORAN_FEM(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    NIDORINA(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    NIDOQUEEN(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.POISON, Type.GROUND});
        }
    },
    NIDORAN_MALE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    NIDORINO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return EKANS.getMonsterTyping();
        }
    },
    NIDOKING(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return NIDOQUEEN.getMonsterTyping();
        }
    },
    CLEFAIRY(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    CLEFABLE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    VULPIX(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    NINETALES(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    JIGGLYPUFF(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    WIGGLYTUFF(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    ZUBAT(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.POISON, Type.FLYING});
        }
    },
    GOLBAT(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return ZUBAT.getMonsterTyping();
        }
    },
    ODDISH(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    GLOOM(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    VILEPLUME(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    PARAS(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.BUG, Type.POISON});
        }
    },
    PARASECT(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PARAS.getMonsterTyping();
        }
    },
    VENONAT(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.getMonsterTyping();
        }
    },
    VENOMOTH(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return WEEDLE.getMonsterTyping();
        }
    },
    DIGLETT(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    DUGTRIO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    MEOWTH(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    PERSIAN(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    PSYDUCK(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    GOLDUCK(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    MANKEY(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.FIGHTING});
        }
    },
    PRIMEAPE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    GROWLITHE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    ARCANINE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    POLIWAG(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    POLIWHIRL(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    POLIWRATH(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.WATER, Type.FIGHTING});
        }
    },
    ABRA(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.PSYCHIC});
        }
    },
    KADABRA(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    ALAKAZAM(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    MACHOP(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    MACHOKE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    MACHAMP(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    BELLSPROUT(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    WEEPINBELL(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    VICTREEBEL(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BULBASAUR.getMonsterTyping();
        }
    },
    TENTACOOL(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.WATER, Type.POISON});
        }
    },
    TENTACRUEL(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return TENTACOOL.getMonsterTyping();
        }
    },
    GEODUDE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.ROCK, Type.GROUND});
        }
    },
    GRAVELER(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return GEODUDE.getMonsterTyping();
        }
    },
    GOLEM(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return GEODUDE.getMonsterTyping();
        }
    },
    PONYTA(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    RAPIDASH(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    SLOWPOKE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.WATER, Type.PSYCHIC});
        }
    },
    SLOWBRO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SLOWPOKE.getMonsterTyping();
        }
    },
    MAGNEMITE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    MAGNETON(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    FARFETCH_D(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    DODUO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    DODRIO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIDGEY.getMonsterTyping();
        }
    },
    SEEL(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    DEWGONG(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.WATER, Type.ICE});
        }
    },
    GRIMER(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.POISON});
        }
    },
    MUK(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return GRIMER.getMonsterTyping();
        }
    },
    SHELLDER(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    CLOYSTER(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return DEWGONG.getMonsterTyping();
        }
    },
    GASTLY(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.GHOST, Type.POISON});
        }
    },
    HAUNTER(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return GASTLY.getMonsterTyping();
        }
    },
    GENGAR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return GASTLY.getMonsterTyping();
        }
    },
    ONIX(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return GEODUDE.getMonsterTyping();
        }
    },
    DROWZEE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    HYPNO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    KRABBY(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    KINGLER(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    VOLTORB(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    ELECTRODE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    EXEGGCUTE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.GRASS, Type.PSYCHIC});
        }
    },
    EXEGGUTOR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return EXEGGCUTE.getMonsterTyping();
        }
    },
    CUBONE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    MAROWAK(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SANDSHREW.getMonsterTyping();
        }
    },
    HITMONLEE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return MAROWAK.getMonsterTyping();
        }
    },
    HITMONCHAN(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return MANKEY.getMonsterTyping();
        }
    },
    LICKITUNG(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    KOFFING(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return GRIMER.getMonsterTyping();
        }
    },
    WEEZING(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return GRIMER.getMonsterTyping();
        }
    },
    RHYHORN(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.GROUND, Type.ROCK});
        }
    },
    RHYDON(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RHYHORN.getMonsterTyping();
        }
    },
    CHANSEY(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    TANGELA(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.GRASS});
        }
    },
    KANGASKHAN(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    HORSEA(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    SEADRA(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    GOLDEEN(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    SEAKING(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    STARYU(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    STARMIE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SLOWPOKE.getMonsterTyping();
        }
    },
    MR_MIME(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    SCYTHER(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return BUTTERFREE.getMonsterTyping();
        }
    },
    JYNX(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.ICE, Type.PSYCHIC});
        }
    },
    ELECTABUZZ(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    MAGMAR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    PINSIR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CATERPIE.getMonsterTyping();
        }
    },
    TAUROS(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    MAGIKARP(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    GYARADOS(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.WATER, Type.FLYING});
        }
    },
    LAPRAS(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return DEWGONG.getMonsterTyping();
        }
    },
    DITTO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    EEVEE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    VAPOREON(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return SQUIRTLE.getMonsterTyping();
        }
    },
    JOLTEON(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return PIKACHU.getMonsterTyping();
        }
    },
    FLAREON(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARMANDER.getMonsterTyping();
        }
    },
    PORYGON(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    OMANYTE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.ROCK, Type.WATER});
        }
    },
    OMASTAR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return OMANYTE.getMonsterTyping();
        }
    },
    KABUTO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return OMANYTE.getMonsterTyping();
        }
    },
    KABUTOPS(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return OMANYTE.getMonsterTyping();
        }
    },
    AERODACTYL(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.ROCK, Type.FLYING});
        }
    },
    SNORLAX(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return RATTATA.getMonsterTyping();
        }
    },
    ARTICUNO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.ICE, Type.FLYING});
        }
    },
    ZAPDOS(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.ELECTRIC, Type.FLYING});
        }
    },
    MOLTRES(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return CHARIZARD.getMonsterTyping();
        }
    },
    DRATINI(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.DRAGON});
        }
    },
    DRAGONAIR(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return DRATINI.getMonsterTyping();
        }
    },
    DRAGONITE(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return new Typing(new Type[]{Type.DRAGON, Type.FLYING});
        }
    },
    MEWTWO(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    MEW(TestMonster.class) {
        @Override
        Typing getMonsterTyping() {
            return ABRA.getMonsterTyping();
        }
    },
    ;

    private final Class<?> monsterClass;
    private static final MonsterInfo[] enums = values();
    abstract Typing getMonsterTyping();

    MonsterInfo(Class<?> monsterClass) {
        this.monsterClass = monsterClass;
    }

    private Class<?> getMonsterClass() {
        return monsterClass;
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
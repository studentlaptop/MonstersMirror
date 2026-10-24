package monster;

import item.ItemInfo;

import java.time.LocalTime;
import java.util.EnumMap;

public enum SpeciesInfo {
    BULBASAUR(new Builder()
            .typing(Type.GRASS, Type.POISON)
            .baseHealth(45)
            .baseAttack(49)
            .baseDefense(49)
            .baseSpeed(45)
            .baseSpecial(65)
    ) {
        @Override
        public SpeciesInfo getEvolution(Monster monster) {
            return monster.getLevel() == 16 ? IVYSAUR : null;
        }
    },
    IVYSAUR(new Builder()
            .typing(Type.GRASS, Type.POISON)
            .baseHealth(60)
            .baseAttack(62)
            .baseDefense(63)
            .baseSpeed(60)
            .baseSpecial(80)
    ) {
        @Override
        public SpeciesInfo getEvolution(Monster monster) {
            return monster.getLevel() == 32 ? VENUSAUR : null;
        }
    },
    VENUSAUR(new Builder()
            .typing(Type.GRASS, Type.POISON)
            .baseHealth(80)
            .baseAttack(82)
            .baseDefense(83)
            .baseSpeed(80)
            .baseSpecial(100)
    ),
    CHARMANDER(new Builder()
            .typing(Type.FIRE)
            .baseHealth(39)
            .baseAttack(52)
            .baseDefense(43)
            .baseSpeed(65)
            .baseSpecial(50)
    ) {
        @Override
        public SpeciesInfo getEvolution(Monster monster) {
            return monster.getLevel() == 16 ? CHARMELEON : null;
        }
    },
    CHARMELEON(new Builder()
            .typing(Type.FIRE)
            .baseHealth(58)
            .baseAttack(64)
            .baseDefense(58)
            .baseSpeed(80)
            .baseSpecial(65)
    ) {
        @Override
        public SpeciesInfo getEvolution(Monster monster) {
            return monster.getLevel() == 36 ? CHARIZARD : null;
        }
    },
    CHARIZARD(new Builder()
            .typing(Type.FIRE, Type.FLYING)
            .baseHealth(78)
            .baseAttack(84)
            .baseDefense(78)
            .baseSpeed(100)
            .baseSpecial(85)
    ),
    SQUIRTLE(new Builder()
            .typing(Type.WATER)
            .baseHealth(44)
            .baseAttack(48)
            .baseDefense(65)
            .baseSpeed(43)
            .baseSpecial(50)
    ) {
        @Override
        public SpeciesInfo getEvolution(Monster monster) {
            return monster.getLevel() == 16 ? WARTORTLE : null;
        }
    },
    WARTORTLE(new Builder()
            .typing(Type.WATER)
            .baseHealth(59)
            .baseAttack(63)
            .baseDefense(80)
            .baseSpeed(58)
            .baseSpecial(65)
    ) {
        @Override
        public SpeciesInfo getEvolution(Monster monster) {
            return monster.getLevel() == 16 ? BLASTOISE : null;
        }
    },
    BLASTOISE(new Builder()
            .typing(Type.WATER)
            .baseHealth(79)
            .baseAttack(83)
            .baseDefense(100)
            .baseSpeed(78)
            .baseSpecial(85)
    ),
    CATERPIE(new Builder()
            .typing(Type.BUG)
            .baseHealth(45)
            .baseAttack(30)
            .baseDefense(35)
            .baseSpeed(45)
            .baseSpecial(20)
    ),
    METAPOD(new Builder()
            .typing(Type.BUG)
            .baseHealth(50)
            .baseAttack(20)
            .baseDefense(55)
            .baseSpeed(30)
            .baseSpecial(25)
    ),
    BUTTERFREE(new Builder()
            .typing(Type.BUG, Type.FLYING)
            .baseHealth(60)
            .baseAttack(45)
            .baseDefense(50)
            .baseSpeed(70)
            .baseSpecial(80)
    ),
    WEEDLE(new Builder()
            .typing(Type.BUG, Type.POISON)
            .baseHealth(40)
            .baseAttack(35)
            .baseDefense(30)
            .baseSpeed(50)
            .baseSpecial(20)
    ),
    KAKUNA(new Builder()
            .typing(Type.BUG, Type.POISON)
            .baseHealth(45)
            .baseAttack(25)
            .baseDefense(50)
            .baseSpeed(35)
            .baseSpecial(25)
    ),
    BEEDRILL(new Builder()
            .typing(Type.BUG, Type.POISON)
            .baseHealth(65)
            .baseAttack(80)
            .baseDefense(40)
            .baseSpeed(75)
            .baseSpecial(45)
    ),
    PIDGEY(new Builder()
            .typing(Type.NORMAL, Type.FLYING)
            .baseHealth(40)
            .baseAttack(45)
            .baseDefense(40)
            .baseSpeed(56)
            .baseSpecial(35)
    ),
    PIDGEOTTO(new Builder()
            .typing(Type.NORMAL, Type.FLYING)
            .baseHealth(63)
            .baseAttack(60)
            .baseDefense(55)
            .baseSpeed(71)
            .baseSpecial(50)
    ),
    PIDGEOT(new Builder()
            .typing(Type.NORMAL, Type.FLYING)
            .baseHealth(83)
            .baseAttack(80)
            .baseDefense(75)
            .baseSpeed(91)
            .baseSpecial(70)
    ),
    RATTATA(new Builder()
            .typing(Type.NORMAL)
            .baseHealth(30)
            .baseAttack(56)
            .baseDefense(35)
            .baseSpeed(72)
            .baseSpecial(25)
    ),
    RATICATE(new Builder()
            .typing(Type.NORMAL)
            .baseHealth(55)
            .baseAttack(81)
            .baseDefense(60)
            .baseSpeed(97)
            .baseSpecial(50)
    ),
    SPEAROW(new Builder()
            .typing(Type.NORMAL, Type.FLYING)
            .baseHealth(40)
            .baseAttack(60)
            .baseDefense(30)
            .baseSpeed(70)
            .baseSpecial(31)

    ),
    FEAROW(new Builder()
            .typing(Type.NORMAL, Type.FLYING)
            .baseHealth(65)
            .baseAttack(90)
            .baseDefense(65)
            .baseSpeed(100)
            .baseSpecial(61)
    ),
    EKANS(new Builder()
            .typing(Type.POISON)
            .baseHealth(35)
            .baseAttack(60)
            .baseDefense(44)
            .baseSpeed(55)
            .baseSpecial(40)
    ),
    ARBOK(new Builder()
            .typing(Type.POISON)
            .baseHealth(60)
            .baseAttack(85)
            .baseDefense(69)
            .baseSpeed(80)
            .baseSpecial(65)
    ),
    PIKACHU(new Builder()
            .typing(Type.ELECTRIC)
            .baseHealth(35)
            .baseAttack(55)
            .baseDefense(30)
            .baseSpeed(90)
            .baseSpecial(50)
    ),
    RAICHU(new Builder()
            .typing(Type.ELECTRIC)
            .baseHealth(60)
            .baseAttack(90)
            .baseDefense(55)
            .baseSpeed(100)
            .baseSpecial(90)
    ),
    SANDSHREW(new Builder()
            .typing(Type.GROUND)
    ),
    SANDSLASH(new Builder()
            .typing(Type.GROUND)
    ),
    NIDORAN_FEMALE(new Builder()
            .typing(Type.POISON)
    ),
    NIDORINA(new Builder()
            .typing(Type.POISON)
    ),
    NIDOQUEEN(new Builder()
            .typing(Type.POISON, Type.GROUND)
    ),
    NIDORAN_MALE(new Builder()
            .typing(Type.POISON)
    ),
    NIDORINO(new Builder()
            .typing(Type.POISON)
    ),
    NIDOKING(new Builder()
            .typing(Type.POISON, Type.GROUND)
    ),
    CLEFAIRY(new Builder()
            .typing(Type.NORMAL)
    ),
    CLEFABLE(new Builder()
            .typing(Type.NORMAL)
    ),
    VULPIX(new Builder()
            .typing(Type.FIRE)
    ),
    NINETALES(new Builder()
            .typing(Type.FIRE)
    ),
    JIGGLYPUFF(new Builder()
            .typing(Type.NORMAL)
    ),
    WIGGLYTUFF(new Builder()
            .typing(Type.NORMAL)
    ),
    ZUBAT(new Builder()
            .typing(Type.POISON, Type.FLYING)
    ),
    GOLBAT(new Builder()
            .typing(Type.POISON, Type.FLYING)
    ),
    ODDISH(new Builder()
            .typing(Type.GRASS, Type.POISON)
    ),
    GLOOM(new Builder()
            .typing(Type.GRASS, Type.POISON)
    ),
    VILEPLUME(new Builder()
            .typing(Type.GRASS, Type.POISON)
    ),
    PARAS(new Builder()
            .typing(Type.BUG, Type.POISON)
    ),
    PARASECT(new Builder()
            .typing(Type.BUG, Type.POISON)
    ),
    VENONAT(new Builder()
            .typing(Type.BUG, Type.POISON)
    ),
    VENOMOTH(new Builder()
            .typing(Type.BUG, Type.POISON)
    ),
    DIGLETT(new Builder()
            .typing(Type.GROUND)
    ),
    DUGTRIO(new Builder()
            .typing(Type.GROUND)
    ),
    MEOWTH(new Builder()
            .typing(Type.NORMAL)
    ),
    PERSIAN(new Builder()
            .typing(Type.NORMAL)
    ),
    PSYDUCK(new Builder()
            .typing(Type.WATER)
    ),
    GOLDUCK(new Builder()
            .typing(Type.WATER)
    ),
    MANKEY(new Builder()
            .typing(Type.FIGHTING)
    ),
    PRIMEAPE(new Builder()
            .typing(Type.FIGHTING)
    ),
    GROWLITHE(new Builder()
            .typing(Type.FIRE)
    ),
    ARCANINE(new Builder()
            .typing(Type.FIRE)
    ),
    POLIWAG(new Builder()
            .typing(Type.WATER)
    ),
    POLIWHIRL(new Builder()
            .typing(Type.WATER)
    ),
    POLIWRATH(new Builder()
            .typing(Type.WATER, Type.FIGHTING)
    ),
    ABRA(new Builder()
            .typing(Type.PSYCHIC)
    ),
    KADABRA(new Builder()
            .typing(Type.PSYCHIC)
    ),
    ALAKAZAM(new Builder()
            .typing(Type.PSYCHIC)
    ),
    MACHOP(new Builder()
            .typing(Type.FIGHTING)
    ),
    MACHOKE(new Builder()
            .typing(Type.FIGHTING)
    ),
    MACHAMP(new Builder()
            .typing(Type.FIGHTING)
    ),
    BELLSPROUT(new Builder()
            .typing(Type.GRASS, Type.POISON)
    ),
    WEEPINBELL(new Builder()
            .typing(Type.GRASS, Type.POISON)
    ),
    VICTREEBEL(new Builder()
            .typing(Type.GRASS, Type.POISON)
    ),
    TENTACOOL(new Builder()
            .typing(Type.WATER, Type.POISON)
    ),
    TENTACRUEL(new Builder()
            .typing(Type.WATER, Type.POISON)
    ),
    GEODUDE(new Builder()
            .typing(Type.ROCK, Type.GROUND)
    ),
    GRAVELER(new Builder()
            .typing(Type.ROCK, Type.GROUND)
    ),
    GOLEM(new Builder()
            .typing(Type.ROCK, Type.GROUND)
    ),
    PONYTA(new Builder()
            .typing(Type.FIRE)
    ),
    RAPIDASH(new Builder()
            .typing(Type.FIRE)
    ),
    SLOWPOKE(new Builder()
            .typing(Type.WATER, Type.PSYCHIC)
    ),
    SLOWBRO(new Builder()
            .typing(Type.WATER, Type.PSYCHIC)
    ),
    MAGNEMITE(new Builder()
            .typing(Type.ELECTRIC)
    ),
    MAGNETON(new Builder()
            .typing(Type.ELECTRIC)
    ),
    FARFETCH_D(new Builder()
            .typing(Type.NORMAL, Type.FLYING)
    ),
    DODUO(new Builder()
            .typing(Type.NORMAL, Type.FLYING)
    ),
    DODRIO(new Builder()
            .typing(Type.NORMAL, Type.FLYING)
    ),
    SEEL(new Builder()
            .typing(Type.WATER)
    ),
    DEWGONG(new Builder()
            .typing(Type.WATER, Type.ICE)
    ),
    GRIMER(new Builder()
            .typing(Type.POISON)
    ),
    MUK(new Builder()
            .typing(Type.POISON)
    ),
    SHELLDER(new Builder()
            .typing(Type.WATER)
    ),
    CLOYSTER(new Builder()
            .typing(Type.WATER, Type.ICE)
    ),
    GASTLY(new Builder()
            .typing(Type.GHOST, Type.POISON)
    ),
    HAUNTER(new Builder()
            .typing(Type.GHOST, Type.POISON)
    ),
    GENGAR(new Builder()
            .typing(Type.GHOST, Type.POISON)
    ),
    ONIX(new Builder()
            .typing(Type.ROCK, Type.GROUND)
    ),
    DROWZEE(new Builder()
            .typing(Type.PSYCHIC)
    ),
    HYPNO(new Builder()
            .typing(Type.PSYCHIC)
    ),
    KRABBY(new Builder()
            .typing(Type.WATER)
    ),
    KINGLER(new Builder()
            .typing(Type.WATER)
    ),
    VOLTORB(new Builder()
            .typing(Type.ELECTRIC)
    ),
    ELECTRODE(new Builder()
            .typing(Type.ELECTRIC)
    ),
    EXEGGCUTE(new Builder()
            .typing(Type.GRASS, Type.PSYCHIC)
    ),
    EXEGGUTOR(new Builder()
            .typing(Type.GRASS, Type.PSYCHIC)
    ),
    CUBONE(new Builder()
            .typing(Type.GROUND)
    ),
    MAROWAK(new Builder()
            .typing(Type.GROUND)
    ),
    HITMONLEE(new Builder()
            .typing(Type.FIGHTING)
    ),
    HITMONCHAN(new Builder()
            .typing(Type.FIGHTING)
    ),
    LICKITUNG(new Builder()
            .typing(Type.NORMAL)
    ),
    KOFFING(new Builder()
            .typing(Type.POISON)
    ),
    WEEZING(new Builder()
            .typing(Type.POISON)
    ),
    RHYHORN(new Builder()
            .typing(Type.GROUND, Type.ROCK)
    ),
    RHYDON(new Builder()
            .typing(Type.GROUND, Type.ROCK)
    ),
    CHANSEY(new Builder()
            .typing(Type.NORMAL)
    ),
    TANGELA(new Builder()
            .typing(Type.GRASS)
    ),
    KANGASKHAN(new Builder()
            .typing(Type.NORMAL)
    ),
    HORSEA(new Builder()
            .typing(Type.WATER)
    ),
    SEADRA(new Builder()
            .typing(Type.WATER)
    ),
    GOLDEEN(new Builder()
            .typing(Type.WATER)
    ),
    SEAKING(new Builder()
            .typing(Type.WATER)
    ),
    STARYU(new Builder()
            .typing(Type.WATER)
    ),
    STARMIE(new Builder()
            .typing(Type.WATER, Type.PSYCHIC)
    ),
    MR_MIME(new Builder()
            .typing(Type.PSYCHIC)
    ),
    SCYTHER(new Builder()
            .typing(Type.BUG, Type.FLYING)
    ),
    JYNX(new Builder()
            .typing(Type.ICE, Type.PSYCHIC)
    ),
    ELECTABUZZ(new Builder()
            .typing(Type.ELECTRIC)
    ),
    MAGMAR(new Builder()
            .typing(Type.FIRE)
    ),
    PINSIR(new Builder()
            .typing(Type.BUG)
    ),
    TAUROS(new Builder()
            .typing(Type.NORMAL)
    ),
    MAGIKARP(new Builder()
            .typing(Type.WATER)
    ),
    GYARADOS(new Builder()
            .typing(Type.WATER, Type.FLYING)
    ),
    LAPRAS(new Builder()
            .typing(Type.WATER, Type.ICE)
    ),
    DITTO(new Builder()
            .typing(Type.NORMAL)
    ),
    EEVEE(new Builder()
            .typing(Type.NORMAL)
            .baseHealth(55)
    ) {
        @Override
        public SpeciesInfo getEvolution(Monster monster) {
            if (monster.getFriendship() == 255) {
                if (LocalTime.now().isAfter(LocalTime.of(3, 59, 59))
                        && LocalTime.now().isBefore(LocalTime.of(20, 0, 0))) {
                    return null; // espeon
                }

                if (LocalTime.now().isAfter(LocalTime.of(19, 59, 59))
                        && LocalTime.now().isBefore(LocalTime.of(4, 0, 0))) {
                    return null; // umbreon
                }
            }
            return null;
        }

        @Override
        public SpeciesInfo getEvolution(Monster monster, ItemInfo item) {
            return switch(item) {
                case FIRE_STONE -> FLAREON;
                case WATER_STONE -> VAPOREON;
                case LIGHTNING_STONE -> JOLTEON;
                default -> null;
            };
        }
    },
    VAPOREON(new Builder()
            .typing(Type.WATER)
    ),
    JOLTEON(new Builder()
            .typing(Type.ELECTRIC)
    ),
    FLAREON(new Builder()
            .typing(Type.FIRE)
            .baseHealth(65)
    ),
    PORYGON(new Builder()
            .typing(Type.NORMAL)
    ),
    OMANYTE(new Builder()
            .typing(Type.ROCK, Type.WATER)
    ),
    OMASTAR(new Builder()
            .typing(Type.ROCK, Type.WATER)
    ),
    KABUTO(new Builder()
            .typing(Type.ROCK, Type.WATER)
    ),
    KABUTOPS(new Builder()
            .typing(Type.ROCK, Type.WATER)
    ),
    AERODACTYL(new Builder()
            .typing(Type.ROCK, Type.FLYING)
    ),
    SNORLAX(new Builder()
            .typing(Type.NORMAL)
    ),
    ARTICUNO(new Builder()
            .typing(Type.ICE, Type.FLYING)
    ),
    ZAPDOS(new Builder()
            .typing(Type.ELECTRIC, Type.FLYING)
    ),
    MOLTRES(new Builder()
            .typing(Type.FIRE, Type.FLYING)
    ),
    DRATINI(new Builder()
            .typing(Type.DRAGON)
    ),
    DRAGONAIR(new Builder()
            .typing(Type.DRAGON)
    ),
    DRAGONITE(new Builder()
            .typing(Type.DRAGON, Type.FLYING)
    ),
    MEWTWO(new Builder()
            .typing(Type.PSYCHIC)
    ),
    MEW(new Builder()
            .typing(Type.PSYCHIC)
    ),
    ;

    private final Typing typing;
    private final EnumMap<Info, Integer> info;

    SpeciesInfo(Builder builder) {
        this.typing = builder.typing;
        this.info = builder.info;
    }

    public int getDexNum() {
        return ordinal() + 1;
    }

    public Typing getTyping() {
        return typing;
    }

    public int getBaseHealth() {
        return info.getOrDefault(Info.BASE_HEALTH, 1);
    }

    public int getBaseAttack() {
        return info.getOrDefault(Info.BASE_ATTACK, 1);
    }

    public int getBaseDefense() {
        return info.getOrDefault(Info.BASE_DEFENSE, 1);
    }

    public int getBaseSpeed() {
        return info.getOrDefault(Info.BASE_SPEED, 1);
    }

    public int getBaseSpecial() {
        return info.getOrDefault(Info.BASE_SPECIAL, 1);
    }

    public SpeciesInfo getEvolution(Monster monster) {
        return null;
    }

    public SpeciesInfo getEvolution(Monster monster, ItemInfo item) {
        return null;
    }


    private static class Builder {
        private Typing typing;
        private final EnumMap<Info, Integer> info = new EnumMap<>(Info.class);

        private Builder typing(Type type) {
            this.typing = new Typing(type);
            return this;
        }

        private Builder typing(Type firstType, Type secondType) {
            this.typing = new Typing(firstType, secondType);
            return this;
        }

        private Builder baseHealth(Integer health) {
            this.info.put(Info.BASE_HEALTH, health);
            return this;
        }

        private Builder baseAttack(Integer attack) {
            this.info.put(Info.BASE_ATTACK, attack);
            return this;
        }

        private Builder baseDefense(Integer defense) {
            this.info.put(Info.BASE_DEFENSE, defense);
            return this;
        }

        private Builder baseSpeed(Integer speed) {
            this.info.put(Info.BASE_SPEED, speed);
            return this;
        }

        private Builder baseSpecial(Integer special) {
            this.info.put(Info.BASE_SPECIAL, special);
            return this;
        }
    }

    private enum Info {
        TYPING,
        BASE_HEALTH,
        BASE_ATTACK,
        BASE_DEFENSE,
        BASE_SPEED,
        BASE_SPECIAL,
    }
}
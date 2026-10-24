package monster.move;

import monster.Monster;
import monster.Type;
import monster.status.Status;
import monster.status.statuses.Statuses;

import java.util.EnumMap;
import java.util.random.RandomGenerator;

public enum MoveInfo {
    ABSORB(new Builder()
            .type(Type.GRASS)
            .accuracy(100)
            .power(20)
            .powerPoints(25)
    ),
    ACID(new Builder()
            .type(Type.POISON)
            .accuracy(100)
            .power(40)
            .powerPoints(30)
    ),
    ACID_ARMOR(new Builder()
            .type(Type.POISON)
            .powerPoints(20)
    ),
    AGILITY(new Builder()
            .type(Type.WATER)
            .powerPoints(30)
    ),
    AMNESIA(new Builder()
            .type(Type.PSYCHIC)
            .powerPoints(20)
    ),
    AURORA_BEAM(new Builder()
            .type(Type.ICE)
            .accuracy(100)
            .power(65)
            .powerPoints(20)
    ),
    BARRAGE(new Builder()
            .type(Type.NORMAL)
            .accuracy(85)
            .power(15)
            .powerPoints(20)
    ),
    BARRIER(new Builder()
            .type(Type.PSYCHIC)
            .powerPoints(20)
    ),
    BIDE(new Builder()
            .type(Type.NORMAL)
            .powerPoints(10)
            .priority(1)
    ),
    BIND(new Builder()
            .type(Type.NORMAL)
            .accuracy(85)
            .power(15)
            .powerPoints(20)
    ),
    BITE(new Builder()
            .type(Type.NORMAL) // TODO: change to Dark
            .accuracy(100)
            .power(60)
            .powerPoints(25)
    ),
    BLIZZARD(new Builder()
            .type(Type.ICE)
            .accuracy(70)
            .power(120)
            .powerPoints(5)
    ),
    BODY_SLAM(new Builder()
            .type(Type.NORMAL)
            .accuracy(100)
            .power(85)
            .powerPoints(15)
    ),
    BONE_CLUB(new Builder()),
    BONEMERANG(new Builder()),
    BUBBLE(new Builder()),
    BUBBLE_BEAM(new Builder()),
    CLAMP(new Builder()),
    COMET_PUNCH(new Builder()),
    CONFUSE_RAY(new Builder()),
    CONFUSION(new Builder()),
    CONSTRICT(new Builder()),
    CONVERSION(new Builder()),
    COUNTER(new Builder()),
    CRABHAMMER(new Builder()),
    CUT(new Builder()),
    DEFENSE_CURL(new Builder()),
    DIG(new Builder()),
    DISABLE(new Builder()),
    DIZZY_PUNCH(new Builder()),
    DOUBLE_KICK(new Builder()),
    DOUBLE_SLAP(new Builder()),
    DOUBLE_TEAM(new Builder()),
    DOUBLE_EDGE(new Builder()),
    DRAGON_RAGE(new Builder()),
    DREAM_EATER(new Builder()),
    DRILL_PECK(new Builder()),
    EARTHQUAKE(new Builder()),
    EGG_BOMB(new Builder()),
    EMBER(new Builder()
            .type(Type.FIRE)
            .accuracy(100)
            .power(40)
            .powerPoints(25)
    ) {
        @Override
        public void effect(Monster monster) {
            attack(monster, this);
            if (isUnaffected(monster) && statusChance(10)) {
                inflictStatus(monster, Statuses.BURN.getStatus());
            }
        }
    },
    EXPLOSION(new Builder()),
    FIRE_BLAST(new Builder()),
    FIRE_PUNCH(new Builder()),
    FIRE_SPIN(new Builder()),
    FISSURE(new Builder()),
    FLAMETHROWER(new Builder()),
    FLASH(new Builder()),
    FLY(new Builder()),
    FOCUS_ENERGY(new Builder()),
    FURY_ATTACK(new Builder()),
    FURY_SWIPES(new Builder()),
    GLARE(new Builder()),
    GROWL(new Builder()),
    GROWTH(new Builder()),
    GUILLOTINE(new Builder()),
    GUST(new Builder()),
    HARDEN(new Builder()),
    HAZE(new Builder()),
    HEADBUTT(new Builder()),
    HIGH_JUMP_KICK(new Builder()),
    HORN_ATTACK(new Builder()),
    HORN_DRILL(new Builder()),
    HYDRO_PUMP(new Builder()),
    HYPER_BEAM(new Builder()),
    HYPER_FANG(new Builder()),
    HYPNOSIS(new Builder()),
    ICE_BEAM(new Builder()),
    ICE_PUNCH(new Builder()),
    JUMP_KICK(new Builder()),
    KARATE_CHOP(new Builder()),
    KINESIS(new Builder()),
    LEECH_LIFE(new Builder()),
    LEECH_SEED(new Builder()),
    LEER(new Builder()),
    LICK(new Builder()),
    LIGHT_SCREEN(new Builder()),
    LOVELY_KISS(new Builder()),
    LOW_KICK(new Builder()),
    MEDITATE(new Builder()),
    MEGA_DRAIN(new Builder()),
    MEGA_KICK(new Builder()),
    MEGA_PUNCH(new Builder()),
    METRONOME(new Builder()),
    MIMIC(new Builder()),
    MINIMIZE(new Builder()),
    MIRROR_MOVE(new Builder()),
    MIST(new Builder()),
    NIGHT_SHADE(new Builder()),
    PAY_DAY(new Builder()),
    PECK(new Builder()),
    PETAL_DANCE(new Builder()),
    PIN_MISSILE(new Builder()),
    POISON_GAS(new Builder()),
    POISON_POWDER(new Builder()),
    POISON_STING(new Builder()),
    POUND(new Builder()),
    PSYBEAM(new Builder()),
    PSYCHIC(new Builder()),
    PSYWAVE(new Builder()),
    QUICK_ATTACK(new Builder()),
    RAGE(new Builder()),
    RAZOR_LEAF(new Builder()),
    RAZOR_WIND(new Builder()),
    RECOVER(new Builder()),
    REFLECT(new Builder()),
    REST(new Builder()),
    ROAR(new Builder()),
    ROCK_SLIDE(new Builder()),
    ROCK_THROW(new Builder()),
    ROLLING_KICK(new Builder()),
    SAND_ATTACK(new Builder()),
    SCRATCH(new Builder()),
    SCREECH(new Builder()),
    SEISMIC_TOSS(new Builder()),
    SELF_DESTRUCT(new Builder()),
    SHARPEN(new Builder()),
    SING(new Builder()),
    SKULL_BASH(new Builder()),
    SKY_ATTACK(new Builder()),
    SLAM(new Builder()),
    SLASH(new Builder()),
    SLEEP_POWDER(new Builder()),
    SLUDGE(new Builder()),
    SMOG(new Builder()),
    SMOKESCREEN(new Builder()),
    SOFT_BOILED(new Builder()),
    SOLAR_BEAM(new Builder()),
    SONIC_BOOM(new Builder()),
    SPIKE_CANNON(new Builder()),
    SPLASH(new Builder()),
    SPORE(new Builder()),
    STOMP(new Builder()),
    STRENGTH(new Builder()),
    STRING_SHOT(new Builder()),
    STRUGGLE(new Builder()),
    STUN_SPORE(new Builder()),
    SUBMISSION(new Builder()),
    SUBSTITUTE(new Builder()),
    SUPER_FANG(new Builder()),
    SUPERSONIC(new Builder()),
    SURF(new Builder()),
    SWIFT(new Builder()),
    SWORDS_DANCE(new Builder()),
    TACKLE(new Builder()),
    TAIL_WHIP(new Builder()),
    TAKE_DOWN(new Builder()),
    TELEPORT(new Builder()),
    THRASH(new Builder()),
    THUNDER(new Builder()),
    THUNDER_PUNCH(new Builder()),
    THUNDER_SHOCK(new Builder()),
    THUNDER_WAVE(new Builder()),
    THUNDERBOLT(new Builder()),
    TOXIC(new Builder()),
    TRANSFORM(new Builder()),
    TRI_ATTACK(new Builder()),
    TWINEEDLE(new Builder()),
    VINE_WHIP(new Builder()),
    VISE_GRIP(new Builder()),
    VOLT_TACKLE(new Builder()
            .type(Type.ELECTRIC)),
    WATER_GUN(new Builder()),
    WATERFALL(new Builder()),
    WHIRLWIND(new Builder()),
    WING_ATTACK(new Builder()),
    WITHDRAW(new Builder()),
    WRAP(new Builder()),
    ;

    private final Type type;
    private final EnumMap<Info, Integer> info;
    private static final RandomGenerator RNG = RandomGenerator.of("L64X128MixRandom");

    MoveInfo(Builder builder) {
        this.type = builder.type;
        this.info = builder.info;
    }

    public Type getType() {
        return type;
    }

    public int getAccuracy() {
        return info.getOrDefault(Info.ACCURACY, -1);
    }

    public int getPower() {
        return info.getOrDefault(Info.POWER, -1);
    }

    public int getPowerPoints() {
        return info.getOrDefault(Info.POWER_POINTS, 1);
    }

    public int getPriority() {
        return info.getOrDefault(Info.PRIORITY, 0);
    }

    public void effect(Monster monster) {} // TODO: make abstract

    private static int attack(Monster monster, MoveInfo move) {
        if (move.getPower() < 0) {
            throw new IllegalArgumentException(move + " is not an attack move");
        }
        return move.getPower();
    }

    public Move create() {
        return new Move(this);
    }

    private static boolean heal() {
        return false;
    }

    private static boolean isUnaffected(Monster monster) {
        return monster.getStatus() == null;
    }

    private static boolean statusChance(int probability) {
        return RNG.nextInt(1, 101) <= probability;
    }

    private static void inflictStatus(Monster monster, Status status) {
        monster.setStatus(status);
    }

    private static class Builder {
        private Type type;
        private final EnumMap<Info, Integer> info =  new EnumMap<>(Info.class);

        private Builder type(Type type) {
            this.type = type;
            return this;
        }

        private Builder accuracy(int accuracy) {
            this.info.put(Info.ACCURACY, accuracy);
            return this;
        }

        private Builder power(int power) {
            info.put(Info.POWER, power);
            return this;
        }


        private Builder powerPoints(int powerPoints) {
            this.info.put(Info.POWER_POINTS, powerPoints);
            return this;
        }

        private Builder priority(int priority) {
            info.put(Info.PRIORITY, priority);
            return this;
        }
    }

    private enum Info {
        ACCURACY,
        POWER,
        POWER_POINTS,
        PRIORITY,
    }
}


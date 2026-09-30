package monster.move.moves.physical;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;
import monster.move.interfaces.Status;
import monster.status.statuses.Statuses;

import java.util.random.RandomGenerator;

public final class VoltTackle extends Move implements Attack, Status {

    public VoltTackle() {
        super();
        setName("Volt Tackle");
        setType(Type.ELECTRIC);
        setAccuracy(100);
        setPowerPoints(25);
    }

    public VoltTackle(String name, Type type, int powerPoints) {
        super(name, type, powerPoints);
    }

    public boolean attack(Monster user, Monster enemy) {
        if (true) { // change to accuracy check eventually
            enemy.setHealth(enemy.getHealth() - ((user.getAttack() / 10) + 40));

            int paralyzeChance = statusChance();

            if (paralyzeChance <= 10) {
                return inflictStatus(enemy);
            }
            return true;
        }
        return false;
    }

    public int statusChance() {
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom"); // look into changing to SplittableRandom
        return rng.nextInt(1, 100);
    }

    public boolean isUnaffected(Monster monster) {
        return monster.getStatus() == null;
    }

    public boolean inflictStatus(Monster monster) {
        if (isUnaffected(monster)) {
            monster.setStatus(Statuses.PARALYZE);
            return true;
        }
        return false;
    }
}

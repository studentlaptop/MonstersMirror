package monster.move.moves.special;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;
import monster.move.interfaces.Status;
import monster.status.statuses.Statuses;

import java.util.random.RandomGenerator;

public class Ember extends Move implements Attack, Status {

    public Ember() {
        super();
        setName("Ember");
        setType(Type.FIRE);
        setAccuracy(100);
        setPowerPoints(25);
    }

    public Ember(String name, Type type, int powerPoints) {
        super(name, type, powerPoints);
    }

    public boolean attack(Monster user, Monster enemy) {
        if (true) { // change to accuracy check eventually
            enemy.setHealth(enemy.getHealth() - ((user.getAttack() / 10) + 40));

            int burnChance = statusChance();

            if (burnChance <= 10) {
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
            monster.setStatus(Statuses.BURN);
            return true;
        }
        return false;
    }
}

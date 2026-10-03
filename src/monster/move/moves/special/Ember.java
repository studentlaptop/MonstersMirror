package monster.move.moves.special;

import monster.Monster;
import monster.Type;
import monster.move.Move;
import monster.move.interfaces.Attack;
import monster.move.interfaces.Status;
import monster.status.statuses.Statuses;

public final class Ember extends Move implements Attack, Status {
    private static final String NAME = "Ember";
    private static final Type TYPE = Type.FIRE;
    private static final int ACCURACY = 95;
    private int powerPoints;

    Ember() {
        super();
        setPowerPoints(25);
    }

    public boolean attack(Monster user, Monster enemy) {
        if (true) { // TODO: change to accuracy check eventually
            enemy.setHealth(enemy.getHealth() - ((user.getAttack() / 10) + 40));

            if (isUnaffected(enemy)) {
                if (statusChance(1,11) == 1) {
                    return inflictStatus(enemy);
                }
                return true;
            }
        }
        return false;
    }

    public boolean inflictStatus(Monster monster) {
        monster.setStatus(Statuses.BURN.getStatus());
        return true;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Type getType() {
        return TYPE;
    }

    @Override
    public int getAccuracy() {
        return ACCURACY;
    }

    @Override
    public int getPowerPoints() {
        return powerPoints;
    }

    @Override
    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }
}
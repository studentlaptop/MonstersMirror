import monster.monsters.Rattata;
import monster.move.Move;
import monster.move.interfaces.Attack;
import monster.move.interfaces.Heal;
import monster.move.interfaces.Status;
import monster.move.moves.physical.PhysicalMoves;
import monster.move.moves.special.SpecialMoves;
import monster.move.moves.support.SupportMoves;

void main() {
    Rattata rattata = new Rattata();
    Rattata rattata2 = new Rattata();
    IO.println(rattata.getName());
    rattata.setMoveSet(new Move[]{PhysicalMoves.TACKLE, PhysicalMoves.SLAM, SupportMoves.SOFT_BOILED, SpecialMoves.EMBER});

    IO.println(rattata.getMoveSet().contains(PhysicalMoves.TACKLE));

    IO.println(rattata.getMoveSet().get(0) == rattata2.getMoveSet().get(0));

    IO.println(rattata.getMoveSet().learn(PhysicalMoves.SLAM));

    for (Move move : rattata.getMoveSet().getMoves()) {
        if (move == null) {
            continue;
        }
        IO.print(move.getName() + ' ');
    }

    Move selectedMove = rattata.getMoveSet().get(3);
    IO.println('\n' + selectedMove.getName());

    if (selectedMove instanceof Attack attackMove) {
        attackMove.attack(rattata, rattata2);
    }

    if (selectedMove instanceof Status statusMove) {
        if (!(selectedMove instanceof Attack)) {
            statusMove.inflictStatus(rattata2);
        }
    }

    if (selectedMove instanceof Heal healMove) {
        healMove.heal(rattata);
    }

    IO.println("Rattata2's status: " + rattata2.getStatus());

    IO.println("Rattata2's health: " + rattata2.getHealth());
}

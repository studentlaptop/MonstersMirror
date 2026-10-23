import item.Item;
import item.ItemInfo;
import monster.Monster;
import monster.monsters.SpeciesInfo;
import monster.move.Move;
import monster.move.interfaces.Attack;
import monster.move.interfaces.Heal;
import monster.move.interfaces.Status;
import monster.move.moves.physical.Physical;
import monster.move.moves.special.Special;
import monster.move.moves.support.Support;

void main() {
    Monster rattata = new Monster(SpeciesInfo.RATTATA, Physical.TACKLE.create(), null, null, null);
    Monster rattata2 = new Monster(SpeciesInfo.RATTATA, Physical.TACKLE.create(), null, null, null);

    IO.println(rattata.getName());
    rattata.setMoves(Physical.TACKLE.create(), Physical.SLAM.create(), Support.SOFT_BOILED.create(), Special.EMBER.create());

    IO.println(rattata.getMoveSet().contains(Physical.TACKLE.create()));

    IO.println(rattata.getFirstMove() == rattata2.getFirstMove());

    IO.println(rattata.getMoveSet().learn(Physical.SLAM.create()));

    for (Move move : rattata.getMoves()) {
        if (move == null) {
            continue;
        }
        IO.print(move.getName() + ' ');
    }

    Move selectedMove = rattata.getFourthMove();
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

    Monster bulbasaur = new Monster(SpeciesInfo.BULBASAUR, Physical.TACKLE.create(), null, null, null);
    bulbasaur.setLevel(16);
    bulbasaur.evolve();
    IO.println(bulbasaur.getSpecies());
    IO.println(bulbasaur.getName());

    Monster eevee = new Monster(SpeciesInfo.EEVEE, Physical.TACKLE.create(), null, null, null);
    Item fireStone = new Item(ItemInfo.FIRE_STONE);
    //fireStone.use(eevee);
    eevee.setItem(fireStone);
    IO.println(eevee.useItem().toString());
    IO.println(eevee.getSpecies());
    IO.println(eevee.getItem());

    Item berry = new Item(ItemInfo.BERRY);
    eevee.setItem(berry);
    eevee.setHealth((eevee.getHealth()/2) - 10);

    eevee.useItem();
    IO.println(eevee.getHealth());
    IO.println(eevee.getItem());
}

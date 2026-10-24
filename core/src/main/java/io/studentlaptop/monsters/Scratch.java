import io.studentlaptop.monsters.item.Item;
import io.studentlaptop.monsters.item.ItemInfo;
import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import io.studentlaptop.monsters.monster.move.Move;
import io.studentlaptop.monsters.monster.move.MoveInfo;

void main() {
    Monster rattata = new Monster(SpeciesInfo.RATTATA);
    Monster rattata2 = new Monster(SpeciesInfo.RATTATA);

    IO.println(rattata.getName());
    rattata.setMoves(MoveInfo.TACKLE, MoveInfo.SLAM, MoveInfo.SOFT_BOILED, MoveInfo.EMBER);

    IO.println(rattata.getMoveSet().contains(MoveInfo.TACKLE.create()));

    IO.println(rattata.getFirstMove() == rattata2.getFirstMove());

    IO.println(rattata.getMoveSet().learn(MoveInfo.SLAM.create()));

    for (Move move : rattata.getMoves()) {
        if (move == null) {
            continue;
        }
        IO.print(move.getName() + ' ');
    }

    Move selectedMove = rattata.getFourthMove();
    IO.println('\n' + selectedMove.getName());

    rattata.getFourthMove().getInfo().effect(rattata2);

    IO.println("Rattata2's status: " + rattata2.getStatus());

    IO.println("Rattata2's health: " + rattata2.getHealth());

    Monster bulbasaur = new Monster(SpeciesInfo.BULBASAUR);
    bulbasaur.setLevel(16);
    bulbasaur.evolve();
    IO.println(bulbasaur.getSpecies());
    IO.println(bulbasaur.getName());

    Monster eevee = new Monster(SpeciesInfo.EEVEE);
    Item fireStone = new Item(ItemInfo.FIRE_STONE);
    fireStone.use(eevee);
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

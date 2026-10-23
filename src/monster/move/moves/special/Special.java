package monster.move.moves.special;

import monster.move.Move;
import monster.move.MoveInfo;
import monster.move.interfaces.Creator;

public enum Special implements Creator {
    EMBER {
        @Override
        public Move create() {
            return new Move(MoveInfo.EMBER);
        }
    }
    ;
}

package monster.move.moves.support;

import monster.move.Move;
import monster.move.MoveInfo;
import monster.move.interfaces.Creator;

public enum Support implements Creator {
    SOFT_BOILED {
        @Override
        public Move create() {
            return new Move(MoveInfo.SOFT_BOILED);
        }
    }
    ;
}

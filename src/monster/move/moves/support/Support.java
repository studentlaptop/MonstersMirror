package monster.move.moves.support;

import monster.move.Move;
import monster.move.interfaces.Creator;

public enum Support implements Creator {
    SOFT_BOILED {
        @Override
        public Move getMove() {
            return new SoftBoiled();
        }
    }
    ;
}

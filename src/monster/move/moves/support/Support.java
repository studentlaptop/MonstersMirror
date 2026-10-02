package monster.move.moves.support;

import monster.move.Move;
import monster.move.interfaces.Singleton;

public enum Support implements Singleton {
    SOFT_BOILED {
        @Override
        public Move getMove() {
            return SoftBoiled.getInstance();
        }
    }
    ;
}

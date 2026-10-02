package monster.move.moves.special;

import monster.move.Move;
import monster.move.interfaces.Singleton;

public enum Special implements Singleton {
    EMBER {
        @Override
        public Move getMove() {
            return Ember.getInstance();
        }
    }
    ;
}

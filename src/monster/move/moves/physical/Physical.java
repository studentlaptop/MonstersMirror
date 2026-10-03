package monster.move.moves.physical;

import monster.move.Move;
import monster.move.interfaces.Creator;

public enum Physical implements Creator {
    TACKLE {
        @Override
        public Move getMove() {
            return new Tackle();
        }
    },
    SLAM {
        @Override
        public Move getMove() {
            return new Slam();
        }
    },
    EARTHQUAKE {
        @Override
        public Move getMove() {
            return new Earthquake();
        }
    },
    KARATE_CHOP {
        @Override
        public Move getMove() {
            return new KarateChop();
        }
    },
    VOLT_TACKLE {
        @Override
        public Move getMove() {
            return new VoltTackle();
        }
    },
    VINE_WHIP {
        @Override
        public Move getMove() {
            return new VineWhip();
        }
    }
    ;
}

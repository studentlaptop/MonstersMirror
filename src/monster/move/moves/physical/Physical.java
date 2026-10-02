package monster.move.moves.physical;

import monster.move.Move;
import monster.move.interfaces.Singleton;

public enum Physical implements Singleton {
    TACKLE {
        @Override
        public Move getMove() {
            return Tackle.getInstance();
        }
    },
    SLAM {
        @Override
        public Move getMove() {
            return Slam.getInstance();
        }
    },
    EARTHQUAKE {
        @Override
        public Move getMove() {
            return Earthquake.getInstance();
        }
    },
    KARATE_CHOP {
        @Override
        public Move getMove() {
            return KarateChop.getInstance();
        }
    },
    VOLT_TACKLE {
        @Override
        public Move getMove() {
            return VoltTackle.getInstance();
        }
    },
    VINE_WHIP {
        @Override
        public Move getMove() {
            return VineWhip.getInstance();
        }
    }
    ;
}

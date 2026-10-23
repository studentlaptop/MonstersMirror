package monster.move.moves.physical;

import monster.move.Move;
import monster.move.MoveInfo;
import monster.move.interfaces.Creator;

public enum Physical implements Creator {
    TACKLE {
        @Override
        public Move create() {
            return new Move(MoveInfo.TACKLE);
        }
    },
    SLAM {
        @Override
        public Move create() {
            return new Move(MoveInfo.SLAM);
        }
    },
    EARTHQUAKE {
        @Override
        public Move create() {
            return new Move(MoveInfo.EARTHQUAKE);
        }
    },
    KARATE_CHOP {
        @Override
        public Move create() {
            return new Move(MoveInfo.KARATE_CHOP);
        }
    },
    VOLT_TACKLE {
        @Override
        public Move create() {
            return new Move(MoveInfo.VOLT_TACKLE);
        }
    },
    VINE_WHIP {
        @Override
        public Move create() {
            return new Move(MoveInfo.VINE_WHIP);
        }
    }
    ;
}

package monster.status.statuses;

import monster.status.Status;

public enum Statuses {
    BURN {
        @Override
        public Status getStatus() {
            return Burn.getInstance();
        }
    },
    CONFUSION {
        @Override
        public Status getStatus() {
            return Confusion.getInstance();
        }
    },
    FREEZE {
        @Override
        public Status getStatus() {
            return Freeze.getInstance();
        }
    },
    PARALYZE {
        @Override
        public Status getStatus() {
            return Paralyze.getInstance();
        }
    },
    POISON {
        @Override
        public Status getStatus() {
            return Poison.getInstance();
        }
    },
    SLEEP {
        @Override
        public Status getStatus() {
            return Sleep.getInstance();
        }
    },
    ;

    public abstract Status getStatus();
}

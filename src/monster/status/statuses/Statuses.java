package monster.status.statuses;

import monster.status.Status;

public enum Statuses {
    BURN {
        @Override
        public Status getStatus() {
            return new Burn();
        }
    },
    CONFUSION {
        @Override
        public Status getStatus() {
            return new Confusion();
        }
    },
    FREEZE {
        @Override
        public Status getStatus() {
            return new Freeze();
        }
    },
    PARALYZE {
        @Override
        public Status getStatus() {
            return new Paralyze();
        }
    },
    POISON {
        @Override
        public Status getStatus() {
            return new Poison();
        }
    },
    SLEEP {
        @Override
        public Status getStatus() {
            return new Sleep();
        }
    },
    ;

    public abstract Status getStatus();
}

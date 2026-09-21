package monster.status.statuses;

public record Statuses() {
    public static final Burn BURN = new Burn();
    public static final Confusion CONFUSION = new Confusion();
    public static final Freeze FREEZE = new Freeze();
    public static final Paralyze PARALYZE = new Paralyze();
    public static final Poison POISON = new Poison();
    public static final Sleep SLEEP = new Sleep();
}

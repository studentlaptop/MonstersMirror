package monster.evolution;

public interface Evolvable {
    boolean evolve();

    default boolean canEvolve() {
        return false;
    }
}

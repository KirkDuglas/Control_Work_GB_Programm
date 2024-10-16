import java.util.HashSet;
import java.util.Set;

public class Horse extends packAnimals {
    public Horse(String name, int age, String species, Set<String> commands) {
        super(name, age, species, commands);
    }
    public Horse(String name, int age, String species) {
        super(name, age, species, new HashSet<String>());
    }
    public Horse(String name, int age) {
        super(name, age, "Horse", new HashSet<String>());
    }
}

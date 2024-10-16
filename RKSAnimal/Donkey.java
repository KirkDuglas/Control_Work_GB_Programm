import java.util.HashSet;
import java.util.Set;

public class Donkey extends packAnimals {
    public Donkey(String name, int age, String species, Set<String> commands) {
        super(name, age, species, commands);
    }
    public Donkey(String name, int age, String species) {
        super(name, age, species, new HashSet<String>());
    }
    public Donkey(String name, int age) {
        super(name, age, "Donkey", new HashSet<String>());
    }
}

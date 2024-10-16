import java.util.HashSet;
import java.util.Set;


public class Camel extends packAnimals {
    public Camel(String name, int age, String species, Set<String> commands) {
        super(name, age, species, commands);
    }
    public Camel(String name, int age, String species) {
        super(name, age, species, new HashSet<String>());
    }
    public Camel(String name, int age) {
        super(name, age, "Camel", new HashSet<String>());
    }
}
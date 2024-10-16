import java.util.HashSet;
import java.util.Set;

public class Hamster extends Pets {
    public Hamster(String name, int age, String species, Set<String> commands) {
        super(name, age, species, commands);
    }
    public Hamster(String name, int age, String species) {
        super(name, age, species, new HashSet<String>());
    }
    public Hamster(String name, int age) {super(name, age, "Hamster", new HashSet<String>());
    }
}
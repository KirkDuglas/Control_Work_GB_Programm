import java.util.HashSet;
import java.util.Set;

public class Dog extends Pets {
    public Dog(String name, int age, String species, Set<String> commands) {
        super(name, age, species, commands);
    }
    public Dog(String name, int age, String species) {
        super(name, age, species, new HashSet<String>());
    }
    public Dog(String name, int age) {
        super(name, age, "Dog", new HashSet<String>());
    }
}
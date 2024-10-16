import java.util.HashSet;
import java.util.Set;

public class Cat extends Pets {
    public Cat(String name, int age, String species, Set<String> commands) {
        super(name, age, species, commands);
    }
    public Cat(String name, int age, String species) {
        super(name, age, species, new HashSet<String>());
    }
    public Cat(String name, int age) {
        super(name, age, "Cat", new HashSet<String>());
    }
}

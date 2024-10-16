import java.util.HashSet;
import java.util.Set;

public abstract class Pets extends friendsOfMan {
    public Pets(String name, int age, String species, Set<String> commands) {
        super(name, age, species, commands);
    }

    public Pets(String name, int age, String species) { super(name, age, species, new HashSet<String>());
    }
}
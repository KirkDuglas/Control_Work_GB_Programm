import java.util.Set;

public abstract class friendsOfMan implements Comparable<friendsOfMan>
{

    protected String name;
    protected int age;
    protected String species;
    protected Set<String>commands;

    public friendsOfMan(String name, int age, String species, Set<String> commands) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.commands =commands;
    }
    public void printCommands() {
        System.out.println("Обучен: ");
        for (String command : commands) {
            System.out.println(command + " ");
        }
    }
    public void trainAnimal(String command) {
        commands.add(command);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int compareTo(friendsOfMan other) {
        int a1 = this.getAge();
        int a2 = other.getAge();
        if (a1 < a2) {
            return -1;
        }
        if (a1 > a2) {
            return 1;
        }
        String n1 = this.getName();
        String n2 = other.getName();
        return n1.compareTo(n2);
    }

}
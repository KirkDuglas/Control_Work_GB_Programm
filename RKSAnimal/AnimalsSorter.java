import java.util.Comparator;

public class AnimalsSorter implements Comparator<friendsOfMan> {
    @Override
    public int compare(friendsOfMan animal1, friendsOfMan animal2) {
        int a1 = animal1.getAge();
        int a2 = animal2.getAge();
        if (a1 < a2) {
            return -1;
        }
        if (a1 > a2) {
            return 1;
        }
        String n1 = animal1.getName();
        String n2 = animal2.getName();
        return n1.compareTo(n2);
    }
}

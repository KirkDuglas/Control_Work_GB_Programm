import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class AnimalRegistry {
    private Map<String, friendsOfMan > animals;

    public AnimalRegistry() {
        this.animals = new HashMap<>();
    }

    public void addAnimal(String name, int age, String species){
        friendsOfMan animal;
        if (species.equalsIgnoreCase("Dog")){
            animal = new Dog(name, age);
        } else if (species.equalsIgnoreCase("Cat")){
            animal = new Cat(name, age);
        } else if (species.equalsIgnoreCase("Hamster")){
            animal = new Hamster(name, age);
        } else if (species.equalsIgnoreCase("Horse")){
            animal = new Horse(name, age);
        } else if (species.equalsIgnoreCase("Camel")){
            animal = new Camel(name, age);
        } else if (species.equalsIgnoreCase("Donkey")){
            animal = new Donkey(name, age);
        } else {
            System.out.println("Неизвестный вид");
            return;
        }
        animals.put(name, animal);
    }
    public void trainAnimal(String name, String command) {

        friendsOfMan animal = animals.get(name);
        if (animal != null) {
            animal.trainAnimal(command);
            System.out.println("Обучить животное " + name + " команде " + command);
        } else {
            System.out.println("Животное не найдено");
        }
    }
    public void printAnimalCommands(String name) {
        friendsOfMan animal = animals.get(name);
        if (animal != null) {
            animal.printCommands();
        } else {
            System.out.println("Животное не найдено");
        }
    }
    public void printAnimalCount() {
        System.out.println("Все животные в реестре: " + animals.size());
    }
    public void printAnimalsByAge() {
        ArrayList<friendsOfMan> animalsList = new ArrayList<friendsOfMan>();
        for (Map.Entry<String, friendsOfMan> mapElement : animals.entrySet()) {
            animalsList.add(mapElement.getValue());
        }
        Collections.sort(animalsList, new AnimalsSorter());
        System.out.println("Животные по возрасту и имени:");
        for (friendsOfMan a : animalsList) {
           System.out.println(Integer.toString(a.getAge()) + " " + a.getName());
        }
    }
}

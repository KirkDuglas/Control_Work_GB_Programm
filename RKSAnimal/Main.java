import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        AnimalRegistry animalRegistry = new AnimalRegistry();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Зарегистрировать животное");
            System.out.println("2. Обучить животное");
            System.out.println("3. Вывести команды исполняемые животным");
            System.out.println("4. Вывести счетчик животных");
            System.out.println("5. Вывести животных по возрасту");
            System.out.println("6. Завершить сеанс");
            System.out.println("Что Вас интересует? : ");

            int choice = scanner.nextInt();

            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Введите имя животное: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите возраст животное: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("К какому виду относится ваше животное: ");
                    String species = scanner.nextLine();
                    animalRegistry.addAnimal(name, age, species);
                    break;

                case 2:
                    System.out.println("Введите имя животного, которого нужно обучить: ");
                    String trainName = scanner.nextLine();
                    System.out.println("Введите команду для обучения: ");
                    String command = scanner.nextLine();
                    animalRegistry.trainAnimal(trainName, command);
                    break;

                case 3:
                    System.out.println("Введите имя животное для печати команд: ");
                    String printCommandName = scanner.nextLine();
                    animalRegistry.printAnimalCommands(printCommandName);
                    break;

                case 4:
                    animalRegistry.printAnimalCount();
                    break;

                case 5:
                    animalRegistry.printAnimalsByAge();
                    break;

                case 6:
                    System.out.println("Программа завершена.");
                    System.exit(0);

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        }
    }
}
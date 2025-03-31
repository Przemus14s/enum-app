package example.com.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Lew", AnimalType.MAMMAL, 5, 190.5, "Sawanna"));
        animals.add(new Animal("Orzeł", AnimalType.BIRD, 3, 5.2, "Góry"));
        animals.add(new Animal("Rekin", AnimalType.FISH, 8, 300.0, "Ocean"));
        animals.add(new Animal("Kobra", AnimalType.REPTILE, 4, 6.3, "Dżungla"));

        System.out.println("\nLista zwierząt:");
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
        }

        System.out.println("\nDodaj nowe zwierzę:");
        System.out.print("Podaj nazwę: ");
        String name = scanner.nextLine();

        System.out.print("Podaj typ zwierzęcia (Mammal, Bird, Fish, Reptile): ");
        String typeInput = scanner.nextLine();

        AnimalType type = AnimalType.fromString(typeInput);
        if (type == null) {
            System.out.println("Nieprawidłowy typ zwierzęcia!");
            return;
        }

        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();

        System.out.print("Podaj wagę: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Podaj środowisko życia: ");
        String habitat = scanner.nextLine();

        Animal newAnimal = new Animal(name, type, age, weight, habitat);
        animals.add(newAnimal);

        System.out.println("\nZaktualizowana lista zwierząt:");
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
        }

        scanner.close();
    }
}

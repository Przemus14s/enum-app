package example.com.cars.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Corolla", 2020, CarCategory.SEDAN));
        cars.add(new Car("BMW X5", 2022, CarCategory.SUV));
        cars.add(new Car("Ford F-150", 2019, CarCategory.TRUCK));
        cars.add(new Car("Audi TT", 2021, CarCategory.COUPE));

        System.out.println("\nLista samochodów:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nDodaj nowy samochód:");
        System.out.print("Podaj model: ");
        String model = scanner.nextLine();

        System.out.print("Podaj rok produkcji: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj typ samochodu (Sedan, SUV, Ciężarówka, Coupe): ");
        String typeInput = scanner.nextLine();
        CarCategory carType = CarCategory.fromString(typeInput);

        if (carType != null) {
            Car newCar = new Car(model, year, carType);
            cars.add(newCar);
            System.out.println("Dodano nowy samochód!");
        } else {
            System.out.println("Nieprawidłowy typ samochodu!");
        }

        System.out.println("\nZaktualizowana lista samochodów:");
        for (Car car : cars) {
            System.out.println(car);
        }

        scanner.close();
    }
}

package example.com.order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order(101);

        order.addProduct(new Product("Laptop", 3500.00, 1));
        order.addProduct(new Product("Myszka", 150.00, 2));
        order.addProduct(new Product("Klawiatura", 250.00, 1));

        System.out.println("\nAktualne zamówienie:\n" + order);

        System.out.println("\nPodaj nazwę produktu do dodania:");
        String productName = scanner.nextLine();
        System.out.println("Podaj cenę:");
        double price = scanner.nextDouble();
        System.out.println("Podaj ilość:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        order.addProduct(new Product(productName, price, quantity));

        System.out.println("\nZaktualizowane zamówienie:\n" + order);

        System.out.println("\nPodaj nazwę produktu do usunięcia:");
        String removeProductName = scanner.nextLine();
        order.removeProduct(removeProductName);

        System.out.println("\nZamówienie po usunięciu produktu:\n" + order);

        System.out.println("\nPodaj nowy status zamówienia (1 - Nowe, 2 - W realizacji, 3 - Wysłane, 4 - Dostarczone):");
        int statusChoice = scanner.nextInt();

        switch (statusChoice) {
            case 1 -> order.changeStatus(OrderStatus.NEW);
            case 2 -> order.changeStatus(OrderStatus.PROCESSING);
            case 3 -> order.changeStatus(OrderStatus.SHIPPED);
            case 4 -> order.changeStatus(OrderStatus.DELIVERED);
            default -> System.out.println("Niepoprawny wybór statusu.");
        }

        System.out.println("\nKońcowy stan zamówienia:\n" + order);

        scanner.close();
    }
}

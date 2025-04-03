package example.com.device.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeviceManager {
    public static void main(String[] args) {
        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(new ElectronicDevice("Apple iPhone", DeviceCategory.PHONE, 75));
        devices.add(new ElectronicDevice("Samsung Galaxy Tab", DeviceCategory.TABLET, 50));
        devices.add(new ElectronicDevice("Dell XPS", DeviceCategory.COMPUTER, 90));
        devices.add(new ElectronicDevice("Sony Bravia", DeviceCategory.TELEVISION, 0));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista urządzeń:");
        for (ElectronicDevice device : devices) {
            System.out.println(device);
        }

        System.out.println("\nKtóre urządzenie chcesz włączyć? (Podaj numer: 1-4)");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= devices.size()) {
            devices.get(choice - 1).powerOn();
        } else {
            System.out.println("Niepoprawny wybór.");
        }

        System.out.println("\nPodaj numer urządzenia, którego chcesz używać:");
        choice = scanner.nextInt();
        if (choice >= 1 && choice <= devices.size()) {
            System.out.println("Ile procent baterii chcesz zużyć?");
            int usage = scanner.nextInt();
            devices.get(choice - 1).useDevice(usage);
        } else {
            System.out.println("Niepoprawny wybór.");
        }

        System.out.println("\nKtóre urządzenie chcesz naładować?");
        choice = scanner.nextInt();
        if (choice >= 1 && choice <= devices.size()) {
            System.out.println("Ile procent baterii chcesz dodać?");
            int charge = scanner.nextInt();
            devices.get(choice - 1).chargeBattery(charge);
        } else {
            System.out.println("Niepoprawny wybór.");
        }

        System.out.println("\nKońcowy stan urządzeń:");
        for (ElectronicDevice device : devices) {
            System.out.println(device);
        }

        scanner.close();
    }
}
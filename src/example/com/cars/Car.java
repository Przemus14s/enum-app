package example.com.cars;

public class Car {
    private String model;
    private int year;
    private CarCategory type;

    public Car(String model, int year, CarCategory type) {
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public CarCategory getType() {
        return type;
    }

    public String getFuelInfo() {
        return "Rodzaj paliwa: " + type.getFuelType();
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Rok: " + year + ", Typ: " + type.getName() +
                ", Miejsca: " + type.getSeats() + ", " + getFuelInfo();
    }
}

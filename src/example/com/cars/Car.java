package example.com.cars;

public class Car {
    private String model;
    private int year;
    private CarType type;

    public Car(String model, int year, CarType type) {
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public CarType getType() {
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

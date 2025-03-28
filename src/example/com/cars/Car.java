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

    @Override
    public String toString() {
        return "Model: " + model + ", Rok: " + year + ", Typ: " + type.getName();
    }

    public CarType getType() {
        return type;
    }
}

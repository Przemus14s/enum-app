package example.com.cars.app;

public enum CarCategory {
    SEDAN("Sedan", 1, "Benzyna", 5),
    SUV("SUV", 2, "Diesel", 7),
    TRUCK("Ciężarówka", 3, "Diesel", 2),
    COUPE("Coupe", 4, "Benzyna", 4);

    private String name;
    private int id;
    private String fuelType;
    private int seats;

    CarCategory(String name, int id, String fuelType, int seats) {
        this.name = name;
        this.id = id;
        this.fuelType = fuelType;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getSeats() {
        return seats;
    }

    public static CarCategory fromString(String typeName) {
        for (CarCategory type : CarCategory.values()) {
            if (type.getName().equalsIgnoreCase(typeName)) {
                return type;
            }
        }
        return null;
    }
}
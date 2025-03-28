package example.com.cars;

enum CarType {
    SEDAN("Sedan", 1),
    SUV("SUV", 2),
    TRUCK("Ciężarówka", 3),
    COUPE("Coupe", 4);

    private String name;
    private int id;

    CarType(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
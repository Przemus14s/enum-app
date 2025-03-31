package example.com.animal;

class Animal {
    private String name;
    private AnimalType type;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Type: " + type.getType();
    }
}


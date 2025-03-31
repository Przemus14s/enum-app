package example.com.animal;

public class Animal {
    private String name;
    private AnimalType type;
    private int age;
    private double weight;
    private String habitat;

    public Animal(String name, AnimalType type, int age, double weight, String habitat) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
    }

    public void makeSound() {
        System.out.println(name + " wydaje dźwięk: " + type.getSound());
    }

    @Override
    public String toString() {
        return "Zwierzę: " + name + ", Typ: " + type.getType() +
                ", Wiek: " + age + " lat, Waga: " + weight + " kg, Środowisko: " + habitat;
    }
}

package example.com.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lew", AnimalType.MAMMAL);
        Animal animal2 = new Animal("Orzeł", AnimalType.BIRD);
        Animal animal3 = new Animal("Sum", AnimalType.FISH);
        Animal animal4 = new Animal("Jaszczurka", AnimalType.REPTILE);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
    }
}
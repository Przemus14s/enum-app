package example.com.shape.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("Kwadrat", 'M', ColorCategory.BLUE));
        shapes.add(new Shape("Prostokąt", 'X', ColorCategory.BLACK));
        shapes.add(new Shape("Trójkąt", 'L', ColorCategory.RED));
        shapes.add(new Shape("Romb", 'M', ColorCategory.GREEN));

        System.out.println("Wprowadź nazwę, rozmiar ('S', 'M', 'L') oraz kolor");
        String name = scanner.nextLine();
        char size = scanner.nextLine().toUpperCase().charAt(0);
        String colorName = scanner.nextLine();

        ColorCategory color = getColor(colorName);
        if (color != null){
            shapes.add(new Shape(name, size, color));
            System.out.println("Utworzono obiekt");
        }
        else System.out.println("Wprowadzono wartość z poza Enum'a");
        for (Shape shape: shapes){
            System.out.println(shape);
        }
    }
    public static ColorCategory getColor(String colorName){
        switch(colorName){
            case "czerwony" ->{
                return ColorCategory.RED;
            }
            case "niebieski" ->{
                return ColorCategory.BLUE;
            }
            case "żółty" ->{
                return ColorCategory.YELLOW;
            }
            case "zielony" ->{
                return ColorCategory.GREEN;
            }
            case "czarny" ->{
                return ColorCategory.BLACK;
            }
            case "biały" -> {
                return ColorCategory.WHITE;
            }
            default -> {
                return null;
            }
        }
    }
}
package example.com.shape;

import example.com.shape.ColorType;
import example.com.shape.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("Kwadrat", 'M', ColorType.BLUE));
        shapes.add(new Shape("Prostokąt", 'X', ColorType.BLACK));
        shapes.add(new Shape("Trójkąt", 'L', ColorType.RED));
        shapes.add(new Shape("Romb", 'M', ColorType.GREEN));

        System.out.println("Wprowadź nazwę, rozmiar ('S', 'M', 'L') oraz kolor");
        String name = scanner.nextLine();
        char size = scanner.nextLine().toUpperCase().charAt(0);
        String colorName = scanner.nextLine();

        ColorType color = getColor(colorName);
        if (color != null){
            shapes.add(new Shape(name, size, color));
            System.out.println("Utworzono obiekt");
        }
        else System.out.println("Wprowadzono wartość z poza Enum'a");
        for (Shape shape: shapes){
            System.out.println(shape);
        }
    }
    public static ColorType getColor(String colorName){
        switch(colorName){
            case "czerwony" ->{
                return ColorType.RED;
            }
            case "niebieski" ->{
                return ColorType.BLUE;
            }
            case "żółty" ->{
                return ColorType.YELLOW;
            }
            case "zielony" ->{
                return ColorType.GREEN;
            }
            case "czarny" ->{
                return ColorType.BLACK;
            }
            case "biały" -> {
                return ColorType.WHITE;
            }
            default -> {
                return null;
            }
        }
    }
}
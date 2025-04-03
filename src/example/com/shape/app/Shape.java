package example.com.shape.app;

public class Shape {
    private String name;
    private char size;
    private ColorCategory color;

    public Shape(String name, char size, ColorCategory color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", size=" + size +
                        ", color=" + color.getColor();
    }

    public ColorCategory getColor() {
        return color;
    }
}
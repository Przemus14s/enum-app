package example.com.shape;

public class Shape {
    private String name;
    private char size;
    private ColorType color;

    public Shape(String name, char size, ColorType color) {
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

    public ColorType getColor() {
        return color;
    }
}
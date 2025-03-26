package example.com.shape;

public enum ColorType {
    RED("czerwony"),

    BLUE("niebieski"),
    YELLOW("zółty"),
    GREEN("zielony"),
    BLACK("czarny", 0),
    WHITE("biały", 1);

    private String color;
    private int id;

    ColorType(String color, int id) {
        this.color = color;
        this.id = id;
    }


    ColorType(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
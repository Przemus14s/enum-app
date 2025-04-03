package example.com.shape.app;

public enum ColorCategory {
    RED("czerwony"),

    BLUE("niebieski"),
    YELLOW("zółty"),
    GREEN("zielony"),
    BLACK("czarny", 0),
    WHITE("biały", 1);

    private String color;
    private int id;

    ColorCategory(String color, int id) {
        this.color = color;
        this.id = id;
    }


    ColorCategory(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
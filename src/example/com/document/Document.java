package example.com.document;

public class Document {
    private String name;
    private String duration;
    private int pages;
    private DocumentType type;
    private int id;

    public Document(String name, String duration, int pages, DocumentType type, int id) {
        this.name = name;
        this.duration = duration;
        this.pages = pages;
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", pages=" + pages +
                ", type=" + type + ", id" + id;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public int getPages() {
        return pages;
    }

    public DocumentType getType() {
        return type;
    }

    public Document(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

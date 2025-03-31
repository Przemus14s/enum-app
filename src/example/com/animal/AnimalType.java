package example.com.animal;

enum AnimalType {
    MAMMAL("Ssaki"),
    BIRD("Ptaki"),
    FISH("Ryby"),
    REPTILE("Gady");

    private String type;

    AnimalType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
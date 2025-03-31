package example.com.animal;

public enum AnimalType {
    MAMMAL("Ssaki", "Ryczy"),
    BIRD("Ptaki", "Ćwierka"),
    FISH("Ryby", "Nie wydaje dźwięku"),
    REPTILE("Gady", "Syczy");

    private String type;
    private String sound;

    AnimalType(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public static AnimalType fromString(String typeName) {
        return switch (typeName.toUpperCase()) {
            case "MAMMAL" -> AnimalType.MAMMAL;
            case "BIRD" -> AnimalType.BIRD;
            case "FISH" -> AnimalType.FISH;
            case "REPTILE" -> AnimalType.REPTILE;
            default -> null;
        };
    }
}
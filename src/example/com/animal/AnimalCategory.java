package example.com.animal;

public enum AnimalCategory {
    MAMMAL("Ssaki", "Ryczy"),
    BIRD("Ptaki", "Ćwierka"),
    FISH("Ryby", "Nie wydaje dźwięku"),
    REPTILE("Gady", "Syczy");

    private String type;
    private String sound;

    AnimalCategory(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public static AnimalCategory fromString(String typeName) {
        return switch (typeName.toUpperCase()) {
            case "MAMMAL" -> AnimalCategory.MAMMAL;
            case "BIRD" -> AnimalCategory.BIRD;
            case "FISH" -> AnimalCategory.FISH;
            case "REPTILE" -> AnimalCategory.REPTILE;
            default -> null;
        };
    }
}
package example.com.device;

enum DeviceType {
    COMPUTER("Komputer"),
    PHONE("Telefon"),
    TABLET("Tablet"),
    TELEVISION("Telewizor");

    private String device;

    DeviceType(String device) {
        this.device = device;
    }

    public String getDevice() {
        return device;
    }
}

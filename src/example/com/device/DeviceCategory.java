package example.com.device;

enum DeviceCategory {
    COMPUTER("Komputer"),
    PHONE("Telefon"),
    TABLET("Tablet"),
    TELEVISION("Telewizor");

    private String device;

    DeviceCategory(String device) {
        this.device = device;
    }

    public String getDevice() {
        return device;
    }
}

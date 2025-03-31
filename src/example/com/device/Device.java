package example.com.device;

class Device {
    private String brand;
    private DeviceType type;
    private boolean isOn;
    private int batteryLevel;

    public Device(String brand, DeviceType type, int batteryLevel) {
        this.brand = brand;
        this.type = type;
        this.isOn = false;
        this.batteryLevel = batteryLevel;
    }

    public void powerOn() {
        if (!isOn && batteryLevel > 0) {
            isOn = true;
            System.out.println(brand + " został włączony.");
        } else if (batteryLevel == 0) {
            System.out.println(brand + " ma rozładowaną baterię!");
        } else {
            System.out.println(brand + " już jest włączony.");
        }
    }

    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println(brand + " został wyłączony.");
        } else {
            System.out.println(brand + " już jest wyłączony.");
        }
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        System.out.println("Bateria " + brand + " naładowana do " + batteryLevel + "%.");
    }

    public void useDevice(int usage) {
        if (isOn) {
            batteryLevel -= usage;
            if (batteryLevel < 0) {
                batteryLevel = 0;
                isOn = false;
                System.out.println(brand + " się wyłączył – bateria rozładowana!");
            } else {
                System.out.println(brand + " zużył " + usage + "% baterii. Pozostało: " + batteryLevel + "%.");
            }
        } else {
            System.out.println("Nie można używać " + brand + ", ponieważ jest wyłączony.");
        }
    }

    @Override
    public String toString() {
        return "Device: " + brand + ", Type: " + type.getDevice() + ", Status: " + (isOn ? "Włączone" : "Wyłączone") + ", Bateria: " + batteryLevel + "%";
    }
}


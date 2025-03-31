package example.com.order;

enum OrderStatus {
    NEW("Nowe"),
    PROCESSING("W realizacji"),
    SHIPPED("Wysłane"),
    DELIVERED("Dostarczone");

    private String statusName;

    OrderStatus(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}

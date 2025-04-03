package example.com.order;

enum OrderCategory {
    NEW("Nowe"),
    PROCESSING("W realizacji"),
    SHIPPED("Wysłane"),
    DELIVERED("Dostarczone");

    private String statusName;

    OrderCategory(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}

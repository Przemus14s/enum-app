package example.com.order.app;

class OrderProduct {
    private String name;
    private double price;
    private int quantity;

    public OrderProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " - " + quantity + " szt., Cena jednostkowa: " + price + " zł, Łącznie: " + getTotalPrice() + " zł";
    }
}

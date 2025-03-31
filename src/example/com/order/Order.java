package example.com.order;

import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private List<Product> products;
    private OrderStatus status;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.status = OrderStatus.NEW;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Dodano produkt: " + product.getName());
    }

    public void removeProduct(String productName) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(productName));
        System.out.println("Usunięto produkt: " + productName);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void changeStatus(OrderStatus newStatus) {
        this.status = newStatus;
        System.out.println("Status zamówienia zmieniony na: " + status.getStatusName());
    }

    @Override
    public String toString() {
        return "Zamówienie nr: " + orderId + ", Status: " + status.getStatusName() + "\n" +
                "Produkty:\n" + products.toString() + "\n" +
                "Łączna wartość: " + calculateTotal() + " zł\n";
    }
}


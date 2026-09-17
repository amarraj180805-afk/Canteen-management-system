package canteen;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<OrderItem> items=new
    ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }

        return total;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);

        for (OrderItem item : items) {
            item.displayOrderItem();
        }

        System.out.println("Total: ₹" + calculateTotal());
    }
}
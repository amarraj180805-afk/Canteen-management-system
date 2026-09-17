package canteen;

public class OrderItem {

    private FoodItem food;
    private int quantity;

    public OrderItem(FoodItem food, int quantity) {
        this.food = food;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return food.getPrice() * quantity;
    }

    public void displayOrderItem() {
        System.out.println(
            food.getName() + " x " + quantity +
            " = ₹" + getTotalPrice()
        );
    }
}

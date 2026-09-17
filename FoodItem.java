package canteen;

public class FoodItem {

    private int foodId;
    private String name;
    private double price;
    private int stock;

    public FoodItem(int foodId, String name, double price, int stock) {
        this.foodId = foodId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        }
    }

    public void displayFood() {
        System.out.println(foodId + " | " + name + " | ₹" + price + " | Stock: " + stock);
    }
}

package canteen;

import java.util.ArrayList;

public class Menu {

    private ArrayList<FoodItem> foodItems;

    public Menu() {
        foodItems = new ArrayList<>();
    }

    public void addFood(FoodItem food) {
        foodItems.add(food);
    }

    public void displayMenu() {
        System.out.println("\n========== CANTEEN MENU ==========");
        System.out.println("ID | Food | Price | Stock");

        for (FoodItem food : foodItems) {
            food.displayFood();
        }
    }

    public FoodItem findFood(int foodId) {
        for (FoodItem food : foodItems) {
            if (food.getFoodId() == foodId) {
                return food;
            }
        }
        return null;
    }
}

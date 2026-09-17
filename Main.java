package canteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student("student1", "1234", "STU101");
        Admin admin = new Admin("admin", "admin123");

        Menu menu = new Menu();

        menu.addFood(new FoodItem(1, "Burger", 60, 20));
        menu.addFood(new FoodItem(2, "Pizza", 100, 15));
        menu.addFood(new FoodItem(3, "Sandwich", 50, 25));

        System.out.println("=================================");
        System.out.println("     SMART CANTEEN MANAGEMENT");
        System.out.println("=================================");

        while (true) {

            System.out.println("\n1. Student");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter username: ");
                String username = sc.next();

                System.out.print("Enter password: ");
                String password = sc.next();

                if (student.login(username, password)) {

                    System.out.println("\nStudent Login Successful!");

                    menu.displayMenu();

                    System.out.print("\nEnter Food ID: ");
                    int foodId = sc.nextInt();

                    FoodItem food = menu.findFood(foodId);

                    if (food != null) {

                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        if (quantity > 0 && quantity <= food.getStock()) {

                            Order order = new Order(101);
                            order.addItem(new OrderItem(food, quantity));
                            food.reduceStock(quantity);

                            Billing billing = new Billing();
                            billing.generateBill(order);

                        } else {
                            System.out.println("Invalid quantity or insufficient stock.");
                        }

                    } else {
                        System.out.println("Food not found.");
                    }

                } else {
                    System.out.println("Invalid username or password.");
                }

            } else if (choice == 2) {

                System.out.print("Enter admin username: ");
                String username = sc.next();

                System.out.print("Enter admin password: ");
                String password = sc.next();

                if (admin.login(username, password)) {

                    System.out.println("\nAdmin Login Successful!");

                    menu.displayMenu();

                    DemandAnalysis analysis = new DemandAnalysis();
                    analysis.showAnalysis();

                } else {
                    System.out.println("Invalid admin login.");
                }

            } else if (choice == 3) {

                System.out.println("\nThank you for using Smart Canteen!");
                break;

            } else {

                System.out.println("Invalid choice.");

            }
        }

        sc.close();
    }
}
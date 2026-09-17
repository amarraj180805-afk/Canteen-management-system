package canteen;

public class Billing {

    public void generateBill(Order order) {
        System.out.println("\n========== BILL ==========");
        order.displayOrder();
        System.out.println("==========================");
        System.out.println("Thank you for ordering!");
    }
}

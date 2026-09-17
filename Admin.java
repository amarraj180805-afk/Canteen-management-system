package canteen;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public void displayAdmin() {
        System.out.println("Admin: " + getUsername());
    }
}

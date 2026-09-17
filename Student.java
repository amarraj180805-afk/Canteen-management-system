package canteen;

public class Student extends User {

    private String studentId;

    public Student(String username, String password, String studentId) {
        super(username, password);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Username: " + getUsername());
    }
}

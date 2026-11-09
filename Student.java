import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        // Creating StudentDetails object
        StudentDetails student = new StudentDetails(name, age, course, id);

        // Display student details
        student.displaySummary();

        scanner.close();
    }
}

// StudentDetails class
class StudentDetails {

    private String name;
    private int age;
    private String course;
    private String studentId;

    // Constructor
    public StudentDetails(String name, int age, String course, String studentId) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.studentId = studentId;
    }

    // Method to display student details
    public void displaySummary() {

        System.out.println("\n===== STUDENT SUMMARY =====");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Course     : " + course);
        System.out.println("===========================");
    }
}

public class Student {
    private String name;
    private int age;
    private String course;
    private String studentId;

    public Student(String name, int age, String course, String studentId) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.studentId = studentId;
    }

    public void displaySummary() {
        System.out.println("\n===== STUDENT SUMMARY =====");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Course     : " + course);
        System.out.println("===========================");
    }
}

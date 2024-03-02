import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        College college1 = new College("ABC College", "City A");
        College college2 = new College("XYZ College", "City B");


        Student student1 = new Student(1, "Yagya", college1);
        Student student2 = new Student(2, "Ankit", college2);


        System.out.print("\nEnter student name to fetch details: ");
        String studentName = scanner.nextLine();


        if (studentName.equalsIgnoreCase(student1.studentName)) {
            System.out.println("\nStudent found! Here are the details:");
            student1.displayStudentInfo();
        } else if (studentName.equalsIgnoreCase(student2.studentName)) {
            System.out.println("\nStudent found! Here are the details:");
            student2.displayStudentInfo();
        } else {
            System.out.println("Student not found!");
        }

        scanner.close();
    }
}
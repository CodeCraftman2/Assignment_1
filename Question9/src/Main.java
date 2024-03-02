import java.util.Scanner;

// Main class to demonstrate the system's functionality
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Display course options
            System.out.println("Course Options:");
            System.out.println("1. CS101 - Introduction to Computer Science");
            System.out.println("2. MATH201 - Calculus");
            System.out.println("3. ENG301 - English Literature");

            // Prompt user to choose a course
            System.out.print("Choose a course (1, 2, or 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Validate user input
            if (choice < 1 || choice > 3) {
                throw new IllegalArgumentException("Invalid choice. Please choose a number between 1 and 3.");
            }

            // Create a Student object
            System.out.print("Enter Student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            Student student = new Student(studentId, studentName);

            // Create a CourseID object based on user's choice
            CourseID courseId;
            switch (choice) {
                case 1:
                    courseId = new CourseID("CS101");
                    break;
                case 2:
                    courseId = new CourseID("MATH201");
                    break;
                case 3:
                    courseId = new CourseID("ENG301");
                    break;
                default:
                    // This should never happen, but included for robustness
                    throw new IllegalStateException("Invalid choice.");
            }

            // Create a Course object using the CourseID
            Course course = new Course(courseId, getCourseName(courseId.getId()));

            // Display enrollment details
            System.out.println("\nEnrolling student in course: " + course.getCourseName());
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Course ID: " + course.getCourseId().getId());

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to get course name based on course ID
    private static String getCourseName(String courseId) {
        switch (courseId) {
            case "CS101":
                return "Introduction to Computer Science";
            case "MATH201":
                return "Calculus";
            case "ENG301":
                return "English Literature";
            default:
                return "Unknown Course";
        }
    }
}

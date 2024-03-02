import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'C' for Car or 'B' for Bicycle: ");
        char choice = scanner.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            Car car = new Car();
            car.accelerate();
            car.brake();
            car.accelerate(60);
            car.accelerate(80, 10);
        } else if (choice == 'B' || choice == 'b') {
            Bicycle bicycle = new Bicycle();
            bicycle.accelerate();
            bicycle.brake();
            bicycle.accelerate(60);
            bicycle.accelerate(80, 10);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
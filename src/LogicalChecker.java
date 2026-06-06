import java.util.Scanner;

public class LogicalChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take three numbers as input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // 2. Check if the third number equals the sum of the first two
        boolean isSumEqual = (num1 + num2 == num3);

        // 3. Display the result using a logical evaluation
        System.out.println("\n--- Result ---");
        if (isSumEqual) {
            System.out.println("True: The third number (" + num3 + ") is the sum of " + num1 + " and " + num2 + ".");
        } else {
            System.out.println("False: The third number (" + num3 + ") is NOT the sum of " + num1 + " and " + num2 + ".");
        }

        scanner.close();
    }
}


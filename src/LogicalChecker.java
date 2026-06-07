import java.util.Scanner;
public class LogicalChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        boolean isSumEqual = (num1 + num2 == num3);
        System.out.println("\n--- Result ---");
        if (isSumEqual) {
            System.out.println("True: The third number (" + num3 + ") is the sum of " + num1 + " and " + num2 + ".");
        } else {
            System.out.println("False: The third number (" + num3 + ") is NOT the sum of " + num1 + " and " + num2 + ".");
        }
        scanner.close();
    }
}


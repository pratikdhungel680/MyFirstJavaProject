import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BASIC CALCULATOR ===");

        // 1. Get the mathematical numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // 2. Get the operational instruction
        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        // 3. Process operations based on user input
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Verify boundary safety to prevent runtime exceptions
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is undefined.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Invalid mathematical operator entered.");
                validOperation = false;
                break;
        }

        // 4. Print clean terminal results
        if (validOperation) {
            System.out.printf("\nResult: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
        }

        scanner.close();
    }
}

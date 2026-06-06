import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user for the value of "n"
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // 2. Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("\nThe first " + n + " numbers of the Fibonacci series are:");

            long first = 0;
            long second = 1;

            // 3. Loop exactly "n" times to print the series
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate the next number in the sequence
                long next = first + second;

                // Shift variables forward for the next iteration
                first = second;
                second = next;
            }
            System.out.println(); // Line break for clean formatting
        }

        scanner.close();
    }
}

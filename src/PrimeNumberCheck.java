import java.util.Scanner;

public class PrimeNumberCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input from the user
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        // 2. Assume the number is prime initially
        boolean isPrime = true;

        // 3. Run prime verification logic
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Check factors from 2 up to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Factor found, so it is not prime
                    break;           // Exit loop early to save processing time
                }
            }
        }

        // 4. Display the final result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        scanner.close();
    }
}

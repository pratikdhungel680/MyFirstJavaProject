import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("\nThe first " + n + " numbers of the Fibonacci series are:");
            long first = 0;
            long second = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        } scanner.close();
    }
}

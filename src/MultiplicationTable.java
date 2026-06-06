import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user for the number
        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();

        System.out.println("\n=== Multiplication Table of " + num + " ===");

        // 2. Loop from 1 to 10 to calculate and print the table
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.printf("%d x %d = %d\n", num, i, result);
        }

        scanner.close();
    }
}


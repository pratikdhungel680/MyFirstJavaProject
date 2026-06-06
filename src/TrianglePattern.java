import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("\n--- Generated Pattern ---");

        // 2. Outer loop controls the rows
        for (int i = 1; i <= rows; i++) {

            // 3. Inner loop prints the exact number of '*' for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // 4. Move to the next line after finishing a row
            System.out.println();
        }

        scanner.close();
    }
}

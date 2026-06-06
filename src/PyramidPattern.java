import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask user for the height of the pyramid
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("\n--- Generated Pyramid ---");

        // 2. Outer loop handles row by row
        for (int i = 1; i <= rows; i++) {

            // 3. First inner loop prints leading padding spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 4. Second inner loop prints the asterisks with a trailing space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // 5. Break line to move to the next row
            System.out.println();
        }

        scanner.close();
    }
}

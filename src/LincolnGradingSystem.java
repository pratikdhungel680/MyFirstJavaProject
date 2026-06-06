import java.util.Scanner;

public class LincolnGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt the user for student marks
        System.out.print("Enter the marks obtained (0 - 100): ");
        double marks = scanner.nextDouble();

        // 2. Validate input boundary constraints
        if (marks < 0 || marks > 100) {
            System.out.println("Error: Invalid input. Marks must be between 0 and 100.");
        } else {
            // 3. Compute grade using nested ternary operators (? :)
            String grade = (marks >= 90) ? "A" :
                    (marks >= 80) ? "B" :
                    (marks >= 70) ? "C" :
                    (marks >= 60) ? "D" : "F";

            // 4. Output the final assigned grade
            System.out.println("\n--- Performance Record ---");
            System.out.printf("Marks Obtained: %.2f%%\n", marks);
            System.out.println("Assigned Grade: " + grade);
        }

        scanner.close();
    }
}


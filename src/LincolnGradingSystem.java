import java.util.Scanner;
public class LincolnGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks obtained (0 - 100): ");
        double marks = scanner.nextDouble();
        if (marks < 0 || marks > 100) {
            System.out.println("Error: Invalid input. Marks must be between 0 and 100.");
        } else {
            String grade = (marks >= 90) ? "A" :
                    (marks >= 80) ? "B" :
                    (marks >= 70) ? "C" :
                    (marks >= 60) ? "D" : "F";
            System.out.println("\n--- Performance Record ---");
            System.out.printf("Marks Obtained: %.2f%%\n", marks);
            System.out.println("Assigned Grade: " + grade);
        }
        scanner.close();
    }
}


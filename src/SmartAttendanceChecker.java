import java.util.Scanner;

public class SmartAttendanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input data from user
        System.out.print("Enter total number of classes conducted: ");
        int classesConducted = scanner.nextInt();

        System.out.print("Enter number of classes attended: ");
        int classesAttended = scanner.nextInt();

        // 2. Validate input logic to prevent dividing by zero or faulty counts
        if (classesConducted <= 0) {
            System.out.println("Error: Total classes conducted must be greater than 0.");
        } else if (classesAttended > classesConducted) {
            System.out.println("Error: Attended classes cannot exceed total classes conducted.");
        } else {
            // 3. Calculate percentage (use double casting to ensure accurate decimal math)
            double attendancePercentage = ((double) classesAttended / classesConducted) * 100;

            // 4. Print results and verify eligibility status
            System.out.printf("\nAttendance Percentage: %.2f%%\n", attendancePercentage);

            if (attendancePercentage >= 75.0) {
                System.out.println("Status: Eligible for Exam");
            } else {
                System.out.println("Status: Not Eligible");
            }
        }

        scanner.close();
    }
}

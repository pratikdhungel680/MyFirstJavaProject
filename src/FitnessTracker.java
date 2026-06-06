import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;
        int highestSteps = 0;
        int totalDays = 7;

        System.out.println("=== 7-DAY FITNESS CHALLENGE TRACKER ===");

        // 1. Loop 7 times to get daily step data
        for (int day = 1; day <= totalDays; day++) {
            System.out.print("Enter steps walked on Day " + day + ": ");
            int dailySteps = scanner.nextInt();

            // Validate that the user doesn't enter negative steps
            if (dailySteps < 0) {
                System.out.println("Invalid input. Steps cannot be negative. Please re-enter.");
                day--; // Repeat the current day iteration
                continue;
            }

            // Accumulate the total step summation
            totalSteps += dailySteps;

            // Track the highest daily value seen so far
            if (dailySteps > highestSteps) {
                highestSteps = dailySteps;
            }
        }

        // 2. Calculate the mathematically precise average
        double averageSteps = (double) totalSteps / totalDays;

        // 3. Display calculated fitness milestones
        System.out.println("\n=== CHALLENGE RESULTS ===");
        System.out.println("Total steps: " + totalSteps);
        System.out.printf("Average steps: %.2f\n", averageSteps);
        System.out.println("Highest number of steps: " + highestSteps);

        scanner.close();
    }
}

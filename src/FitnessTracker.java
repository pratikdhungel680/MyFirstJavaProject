import java.util.Scanner;
public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;
        int highestSteps = 0;
        int totalDays = 7;
        System.out.println("=== 7-DAY FITNESS CHALLENGE TRACKER ===");
        for (int day = 1; day <= totalDays; day++) {
            System.out.print("Enter steps walked on Day " + day + ": ");
            int dailySteps = scanner.nextInt();
            if (dailySteps < 0) {
                System.out.println("Invalid input. Steps cannot be negative. Please re-enter.");
                day--;
                continue;
            }
            totalSteps += dailySteps;
            if (dailySteps > highestSteps) {
                highestSteps = dailySteps;
            }}
        double averageSteps = (double) totalSteps / totalDays;
        System.out.println("\n=== CHALLENGE RESULTS ===");
        System.out.println("Total steps: " + totalSteps);
        System.out.printf("Average steps: %.2f\n", averageSteps);
        System.out.println("Highest number of steps: " + highestSteps);      scanner.close();}}



import java.util.Calendar;
import java.util.Scanner;

public class AIAgePredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get current age
        System.out.print("Enter your current age: ");
        int currentAge = scanner.nextInt();

        // 2. Validate input
        if (currentAge < 0) {
            System.out.println("Error: Age cannot be negative.");
        } else {
            // 3. Calculate future ages
            int ageAfter10 = currentAge + 10;
            int ageAfter25 = currentAge + 25;
            int ageAfter50 = currentAge + 50;

            // 4. Calculate the bonus milestone (Year they turn 100)
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int yearsTo100 = 100 - currentAge;
            int yearTurning100 = currentYear + yearsTo100;

            // 5. Display predictions
            System.out.println("\n=== AI AGE PREDICTIONS ===");
            System.out.println("Your age after 10 years will be: " + ageAfter10);
            System.out.println("Your age after 25 years will be: " + ageAfter25);
            System.out.println("Your age after 50 years will be: " + ageAfter50);

            System.out.println("\n*** BONUS PREDICTION ***");
            if (currentAge >= 100) {
                System.out.println("You have already reached or passed 100 years old!");
            } else {
                System.out.println("You will turn 100 years old in the year: " + yearTurning100);
            }
        }

        scanner.close();
    }
}


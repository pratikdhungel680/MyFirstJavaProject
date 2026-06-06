import java.util.Scanner;
    public class PalindromeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            // Call the method and print the result
            if (isPalindrome(num)) {
                System.out.println(num + " is a palindrome (true).");
            } else {
                System.out.println(num + " is NOT a palindrome (false).");
            }

            scanner.close();
        }

        /**
         * Method to check if an integer is a palindrome.
         * Time Complexity: O(log10(x))
         * Space Complexity: O(1)
         */
        public static boolean isPalindrome(int x) {
            // Negative numbers are not palindromes (e.g., -121 reads as 121- from right)
            // Also, numbers ending in 0 (except 0 itself) cannot be palindromes
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }

            int originalNumber = x;
            int reversedNumber = 0;

            // Reverse the integer mathematically
            while (x > 0) {
                int lastDigit = x % 10;
                reversedNumber = (reversedNumber * 10) + lastDigit;
                x = x / 10; // Remove the last digit
            }

            // Return true if the reversed number matches the original
            return originalNumber == reversedNumber;
        }
    }

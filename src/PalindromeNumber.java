import java.util.Scanner;
    public class PalindromeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            if (isPalindrome(num)) {
                System.out.println(num + " is a palindrome (true).");
            } else {
                System.out.println(num + " is NOT a palindrome (false).");
            }
            scanner.close();
        }
        public static boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int originalNumber = x;
            int reversedNumber = 0;
            while (x > 0) {
                int lastDigit = x % 10;
                reversedNumber = (reversedNumber * 10) + lastDigit;
                x = x / 10;
            }
            return originalNumber == reversedNumber;}}



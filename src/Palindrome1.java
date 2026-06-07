import java.util.Scanner;
public class Palindrome1 {public static void main(String[] args) {
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

    private static boolean isPalindrome(int num) {
        return false;
    }

}

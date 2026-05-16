public class Uranary {
    public static void main(String[] args) {
        int x = 10;
        boolean flag = true;

        // 1. Unary Plus (+) & Minus (-)
        System.out.println("Unary Minus: " + (-x)); // Result: -10

        // 2. Increment Operator (++)
        System.out.println("Pre-increment: " + (++x)); // Increments first (11), then prints 11
        System.out.println("Post-increment: " + (x++)); // Prints current (11), then increments to 12

        // 3. Decrement Operator (--)
        System.out.println("Pre-decrement: " + (--x)); // Decrements first (11), then prints 11
        System.out.println("Post-decrement: " + (x--)); // Prints current (11), then decrements to 10

        // 4. Logical NOT (!)
        System.out.println("Logical NOT: " + (!flag)); // Inverts true to false

        // 5. Bitwise Complement (~)
        // Formula: ~n = -(n + 1)
        System.out.println("Bitwise Complement: " + (~x)); // Result: -11
    }
}


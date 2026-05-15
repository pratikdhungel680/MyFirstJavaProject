public class OperatorDemo {
    public static void main(String[] args) {
        // 1. Arithmetic Operators: Used for basic math (+, -, *, /, %)
        int a = 15, b = 4;
        System.out.println("--- Arithmetic Operators ---");
        System.out.println("Addition (a + b): " + (a + b));       // 19
        System.out.println("Modulo (Remainder: a % b): " + (a % b)); // 3

        // 2. Relational Operators: Return true or false (==, !=, >, <, >=, <=)
        System.out.println("\n--- Relational Operators ---");
        System.out.println("Is a equal to b? (a == b): " + (a == b)); // false
        System.out.println("Is a greater than b? (a > b): " + (a > b)); // true

        // 3. Logical Operators: Combine multiple conditions (&&, ||, !)
        boolean x = true, y = false;
        System.out.println("\n--- Logical Operators ---");
        System.out.println("Logical AND (x && y): " + (x && y)); // false (both must be true)
        System.out.println("Logical OR (x || y): " + (x || y));  // true (at least one is true)

        // 4. Assignment Operators: Assign and update values (=, +=, -=, etc.)
        int c = 10;
        System.out.println("\n--- Assignment Operators ---");
        c += 5; // Equivalent to c = c + 5
        System.out.println("Value after c += 5: " + c); // 15

        // 5. Unary Operators: Work on a single operand (++, --)
        System.out.println("\n--- Unary Operators ---");
        System.out.println("Original b: " + b);
        System.out.println("Incremented b (++b): " + (++b)); // 5

        // 6. Ternary Operator: A shorthand for if-else
        // Syntax: condition ? value_if_true : value_if_false
        int max = (a > b) ? a : b;
        System.out.println("\n--- Ternary Operator ---");
        System.out.println("The maximum value is: " + max);
    }
}


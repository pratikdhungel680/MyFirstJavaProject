public class GraphMain {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND (&&)
        // Output: false (because y is false)
        System.out.println("x && y: " + (x && y));

        // Logical OR (||)
        // Output: true (because x is true)
        System.out.println("x || y: " + (x || y));

        // Logical NOT (!)
        // Output: false (reverses the value of x)
        System.out.println("!x: " + (!x));

        // Using operators with conditions
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18 && isCitizen) {
            System.out.println("Eligible to vote.");
        }
    }
}

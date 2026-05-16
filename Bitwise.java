public class Bitwise {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 7; // Binary: 0111

        // Bitwise AND (&): 1 if both bits are 1
        System.out.println("a & b: " + (a & b)); // Output: 5 (0101)

        // Bitwise OR (|): 1 if at least one bit is 1
        System.out.println("a | b: " + (a | b)); // Output: 7 (0111)

        // Bitwise XOR (^): 1 if bits are different
        System.out.println("a ^ b: " + (a ^ b)); // Output: 2 (0010)

        // Bitwise NOT (~): Inverts all bits (~x is equal to -x-1)
        System.out.println("~a: " + (~a));       // Output: -6

        // Left Shift (<<): Shifts bits left, filling with 0
        System.out.println("a << 2: " + (a << 2)); // Output: 20 (10100)

        // Signed Right Shift (>>): Shifts bits right, preserving sign bit
        System.out.println("b >> 1: " + (b >> 1)); // Output: 3 (0011)

        // Unsigned Right Shift (>>>): Shifts bits right, filling with 0
        int c = -5;
        System.out.println("c >>> 1: " + (c >>> 1)); // Output: 2147483645
    }
}

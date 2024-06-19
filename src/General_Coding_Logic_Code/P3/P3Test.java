public class P3Test {

    // Function to generate the Fibonacci sequence up to the specified number of elements using iteration
    public static void generateFibonacciIterative(int count) {
        if (count <= 0) {
            return;
        }

        int[] fibSequence = new int[count];
        fibSequence[0] = 0;

        if (count > 1) {
            fibSequence[1] = 1;
        }

        // Calculate Fibonacci numbers iteratively
        for (int i = 2; i < count; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }

        // Print the Fibonacci sequence
        for (int i = 0; i < count; i++) {
            System.out.print(fibSequence[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }

    // Main function to test the generateFibonacciIterative method
    public static void main(String[] args) {
        int count = 50; // Specify the number of Fibonacci sequence elements to generate
        System.out.println("Fibonacci sequence up to " + count + " elements:");
        generateFibonacciIterative(count);
    }
}

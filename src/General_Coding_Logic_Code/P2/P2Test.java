public class P2Test {

    // Function to perform FizzBuzz on numbers from 1 to 100
    public static void fizzBuzz() {
        // Iterate through numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } 
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.print("Fizz");
            } 
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.print("Buzz");
            } 
            // If the number is not divisible by either 3 or 5, print the number
            else {
                System.out.print(i);
            }
            
            // Print a comma and space after each element, except the last one
            if (i < 100) {
                System.out.print(", ");
            }
        }
    }

    // Main function to test the fizzBuzz method
    public static void main(String[] args) {
        fizzBuzz();
    }
}

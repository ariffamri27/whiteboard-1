import java.util.Scanner;

public class P7Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer x: ");
        int x = scanner.nextInt();
        scanner.close();

        int sqrt = sqrt(x);
        System.out.println("Square root of " + x + " is: " + sqrt);
    }

    // Function to compute the square root of a non-negative integer x.
    public static int sqrt(int x) {
        if (x == 0 || x == 1) { // Base cases for 0 and 1
            return x;
        }
        
        long left = 1; // Start with left boundary at 1
        long right = x; // End with right boundary at x
        
        while (left <= right) {
            long mid = left + (right - left) / 2; // Calculate mid point
            
            long square = mid * mid; // Calculate square of mid
            
            if (square == x) {
                return (int) mid; // Found exact square root
            } else if (square < x) {
                left = mid + 1; // Mid is too small, search upper half
            } else {
                right = mid - 1; // Mid is too large, search lower half
            }
        }
        
        // Since x is assumed to be a perfect square, we should never reach here
        return -1;
    }
}

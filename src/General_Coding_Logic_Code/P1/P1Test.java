public class P1Test {
   
   // Function to sort the array in ascending order
   public static void sortArray(int[] array) {
      // Using Bubble Sort algorithm
      int n = array.length;
      for (int i = 0; i < n - 1; i++) {
         // Last i elements are already sorted
         for (int j = 0; j < n - 1 - i; j++) {
            // Swap if the element found is greater than the next element
            if (array[j] > array[j + 1]) {
               int temp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = temp;
            }
         }
      }
   }

   // Main function to test the sortArray method
   public static void main(String[] args) {
      int[] array = {21, 400, 8, -3, 77, 99, -16, 55, 111, -36, 28};
      
      // Print original array
      System.out.print("Original array: ");
      for (int num : array) {
         System.out.print(num + " ");
      }
      System.out.println();
      
      // Sort the array
      sortArray(array);
      
      // Print sorted array
      System.out.print("Sorted array: ");
      for (int num : array) {
         System.out.print(num + " ");
      }
   }
}

import java.util.*;

public class P5Test {

    public static List<Integer> findSymmetricDifference(List<Integer> list1, List<Integer> list2) {
        // Convert lists to HashSet for efficient lookup
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        
        // HashSet to store symmetric difference
        HashSet<Integer> symmetricDifference = new HashSet<>();
        
        // Add elements from list1 that are not in list2
        for (Integer num : list1) {
            if (!set2.contains(num)) {
                symmetricDifference.add(num);
            }
        }
        
        // Add elements from list2 that are not in list1
        for (Integer num : list2) {
            if (!set1.contains(num)) {
                symmetricDifference.add(num);
            }
        }
        
        // Convert HashSet to List for output
        List<Integer> result = new ArrayList<>(symmetricDifference);
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4, 5, 2, 3, 1, 6);
        List<Integer> list2 = Arrays.asList(8, 7, 6, 9, 4, 5);

        List<Integer> symmetricDifference = findSymmetricDifference(list1, list2);

        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
}

import java.util.*;

public class P4Test {

    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        // Convert list1 to a HashSet
        HashSet<Integer> set1 = new HashSet<>(list1);
        
        // List to store intersection elements
        List<Integer> intersection = new ArrayList<>();
        
        // Iterate through list2 and check against set1
        for (Integer num : list2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        
        return intersection;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4, 5, 2, 3, 1, 6);
        List<Integer> list2 = Arrays.asList(8, 7, 6, 9, 4, 5);

        List<Integer> intersection = findIntersection(list1, list2);

        System.out.println("Intersection: " + intersection);
    }
}

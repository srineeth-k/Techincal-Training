import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7));

        // Find common elements
        Set<Integer> common = new HashSet<>(set1); // copy of set1
        common.retainAll(set2); // keeps only elements present in set2

        System.out.println("Common elements: " + common);
    }
}

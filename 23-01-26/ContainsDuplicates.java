import java.util.*;

public class ContainsDuplicates {

    public static void containsDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);

        if (set.size() < list.size()) {
            System.out.println("Duplicates exist");
        } else {
            System.out.println("No duplicates");
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 2);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);

        containsDuplicates(list1);
        containsDuplicates(list2);
    }
}

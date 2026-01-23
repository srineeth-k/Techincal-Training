import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // HashSet example
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(1);
        hashSet.add(3); // duplicate

        System.out.println("HashSet (no order): " + hashSet);

        // TreeSet example
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(3); // duplicate

        System.out.println("TreeSet (sorted): " + treeSet);
    }
}

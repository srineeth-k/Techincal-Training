import java.util.*;

public class Reverse {
    
    public static void reverseList(List <Integer> list){
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void main(String args[]){
        List<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(2,3,4,5,6,7));
        reverseList(list);

    }
    
}

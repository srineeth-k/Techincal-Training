import java.util.*;

public class SecondLargest {

    public static void secondLargest(List<Integer> list){
        TreeSet<Integer> set=new TreeSet<>(list);
        list= new ArrayList<Integer>(set);
        int size=list.size();
        if(size<2){
            System.out.println("less than 2 elements");
            return;
        }
        System.out.println(list.get(list.size()-2));

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,4,5,4,6,7,8,5,8,9,9));
        secondLargest(list);
    }
}

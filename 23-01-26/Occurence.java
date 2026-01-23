import java.util.*;

public class Occurence {
    
    public static void countOccurences(List<Integer> list){
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer i : list){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);

    }
    public static void main(String args[]){
        List<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5));
        countOccurences(list);

    }
    
}

import java.util.*;


public class RemoveDuplicates {
    
    public static void removeDuplicates(List<Integer> list){
        Set<Integer> set= new HashSet<>(list);
        Set<Integer> lset= new LinkedHashSet<>(list);
        System.out.println(set);
        System.out.println(lset);
    }

    public static String removeChar(String s){
        Set<Character> set =new LinkedHashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char ch :s.toCharArray()){
            set.add(ch);
        }
        for(char ch :set){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String args[]){
        List<Integer> list =new ArrayList<>();
        Integer arr[]={4,2,4,6,7,8,8,9,0,0};
        list=Arrays.asList(arr);
        removeDuplicates(list);
        System.out.println(removeChar("hello"));

    }
    
}

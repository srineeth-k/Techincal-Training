import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int max=Integer.MIN_VALUE;
        int prev=Integer.MIN_VALUE;
        while(i<n){
            if(arr[i]>max){
                prev=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>prev){
                prev=arr[i];
            }
            
            i++;
        }

        System.out.println(prev);
    }
    
}

import java.util.*;
public class SortZerosOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            else{
                arr[i++]=0;
                arr[j--]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}

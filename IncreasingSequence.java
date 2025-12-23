import java.util.Scanner;

public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int idx=-1,count=0;
        int maxlen=0;
        int currlen=0;
        while(i<n-1){
            int k=i;
            int j=i+1;
            while(j<n && arr[k]<arr[j] ){
                if(maxlen==0){
                idx=i;
                maxlen=j-i+1;
            }
            else{
                currlen=j-i+1;
                if(currlen>maxlen){
                    maxlen=currlen;
                    idx=i;
                    
                }
            }   
                j++;
                k++;
            }
            count++;
            i=j;
          
        }
    System.out.println("index "+idx+"length: "+maxlen+ "count: "+count);
    for(int j=idx;j<idx+maxlen;j++){
        System.out.println(arr[j]);
    }
    }
}

class EvenThread extends Thread{
    private int arr[];
    EvenThread(int arr[]){
        this.arr=arr;
    }
    public void run(){
        System.out.println(getName());
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
class OddThread extends Thread{
    private int arr[];
    OddThread(int arr[]){
        this.arr=arr;
    }
    public void run(){
        System.out.println(getName());
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}

public class ThreadEvenOdd{
    public static void main(String args[]) throws InterruptedException{
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        EvenThread t1=new EvenThread(arr);
        OddThread t2= new OddThread(arr);
        t1.setName("Even Numbers");
        t2.setName("Odd Numbers");
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t1.join();
        t2.start();                             
    }
    
}

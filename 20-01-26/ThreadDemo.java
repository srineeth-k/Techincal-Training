class ThreadClass extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println("Thread running "+i);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Runnable thread running "+i);}
    }
}
public class ThreadDemo{
    public static void main(String args[]) throws InterruptedException{
        ThreadClass t1=new ThreadClass();
        t1.start();
        t1.join(); 
        System.out.println("--- T1 is done, now starting T2 ---");
        Thread t2=new Thread(new MyRunnable());
        t2.start();
    }
}

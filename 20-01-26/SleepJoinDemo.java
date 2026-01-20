
class MyTask extends Thread {
    public void run() {
        try {
            System.out.println(getName() + " is starting...");
            Thread.sleep(2000); 
            System.out.println(getName() + " is finished!");
        } catch (InterruptedException e) { }
    }
}

public class SleepJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyTask t1 = new MyTask();
        t1.setName("Worker-1");

        t1.start(); 
        System.out.println("Main: I am waiting for the worker...");
        
        t1.join(); 

        System.out.println("Main: Finally! Now I can finish too.");
    }
}
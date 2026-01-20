class MyThread extends Thread{
    public void run(){
        System.out.println(getName() + " (Priority " + getPriority() + ") STARTED.");
        long count=0;
        for (int i = 0; i < 1000000000; i++) { 
            count++; 
        }
        System.out.println(getName() + " (Priority " + getPriority() + ") FINISHED!");
        
    }
}


public class PriorityDemo {
    public static void main(String args[]){
        MyThread t1 =new MyThread();
        MyThread t2 =new MyThread();
        MyThread t3 =new MyThread();
        MyThread t4 =new MyThread();
        t1.setName("First Thread");
        t2.setName("Second Thread");
        t3.setName("Third Thread");
        t4.setName("Fourth Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(8);
        t3.setPriority(4);
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}

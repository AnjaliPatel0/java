class MyThread extends Thread {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(getName() + " is running with practice");
            Thread.yield();
        }
    }
}
public class PriorityExamplewithoutSuper {
    public static void main(String[] args) {
           MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();  
            
            t1.setName("Low Priority");
            t2.setName("High Priority ");
           
            t1.setPriority(Thread.MIN_PRIORITY); // 1
            t2.setPriority(Thread.MAX_PRIORITY); // 10 Priority   
            t1.start();
            t2.start();                                                                                    
    }
}

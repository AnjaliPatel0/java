
class myRunnable implements Runnable{

    public void run(){
        System.out.println(" thread using Runnable interface");
    }
}
public class Create_Thread {
    public static void main(String[] args) {
        myRunnable obj = new myRunnable();
        Thread_Practice t1 = new Thread_Practice(obj);
        t1.start();
         try {
            t1.join();
         } catch (Exception e) {
            e.printStackTrace();
         }
         for(int i=1;i<5;i++){
            System.out.println(i);
         }
        System.out.println(" Main thread is running");
    }
    
}

class MyRunnable implements Runnable{

    public void run(){
        System.out.println(" thread using Runnable interface");
    }
}
public class Create_Thread {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
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

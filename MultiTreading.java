 class MyThread extends Thread {
    public void run(){
      System.out.println("hello");
       try{
         Thread.sleep(2000);
      }
          catch(Exception e){
          
      }
         System.out.println("hiii");
   }
    
}
public class MultiTreading {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        
       // for(int i=0;i<5;i++){
       // System.out.println("hii");
       // }
    }
}

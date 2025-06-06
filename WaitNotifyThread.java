 class WaitNotify extends Thread{
 private boolean isSignal = false;
 public synchronized void sendSignal(){
  isSignal = true;
  System.out.println("Producer : Signal sending...");
  notify();
 }
 public synchronized void waitSignal(){
  while (!isSignal) {
   try{
    System.out.println("Consumer : waiting...");
    wait();
   }
   catch(Exception ex){

   }
  }
  System.out.println("Consumer : gets processing..." );
 }
}
public class WaitNotifyThread {   
 public static void main(String[] args) {
  WaitNotify obj = new WaitNotify();
  Thread consumer = new Thread(()->{
   obj.waitSignal();
  });
  Thread producer = new Thread(()-> {
   try {
    Thread.sleep(2000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
   obj.sendSignal();
  });
  consumer.start();
  producer.start();
 }
}


class Withdraw extends Thread_Practice{
    int amount ;
    int balance;
    public Withdraw(int amount){
        this.amount=amount;
    }
    public void run(){
        synchronized(Withdraw.class){
            if(balance>=amount){
               System.out.println(Thread_Practice.currentThread().getName() + "");
               try {
                Thread_Practice.sleep(1000);
               } catch (InterruptedException e) {
                balance-=amount;
                System.out.println(Thread_Practice.currentThread().getName());
               }
            }
        }
    }
}
public class Synchronized {
    public static void main(String[] args) {
         Withdraw b1 = new Withdraw(800);
         Withdraw b2=new Withdraw(500);
        b1.start();
        b2.start();
         
    }
    
}

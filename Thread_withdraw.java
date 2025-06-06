class Withdrawal implements Runnable{
   static  int balance =1000;
    int tempbal;
    public Withdrawal(int tempbal){
        this.tempbal =tempbal;
    }
    public void run(){
        if(tempbal>=balance){
            System.out.println("InSufficient balance for withdraw " +tempbal);
        }
        else{
            System.out.println("Withdraw Amount " +tempbal);
            balance-=tempbal;
            System.out.println("Remaining amount " +balance);
        }
    }
}

public class Thread_withdraw {
    
    public static void main(String[] args) {
      Withdrawal b1 = new Withdrawal(800);
        Thread_Practice t1 = new Thread_Practice(b1);
        
        Withdrawal b2=new Withdrawal(500);
        Thread_Practice t2 =new Thread_Practice(b2);
        t1.start();
        t2.start(); 
        
    }
    
}

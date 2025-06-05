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
        Thread t1 = new Thread(b1);
        
        Withdrawal b2=new Withdrawal(500);
        Thread t2 =new Thread(b2);
        t1.start();
        t2.start(); 
        
    }
    
}

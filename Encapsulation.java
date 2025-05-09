class ATM{
    private int a;
  public  void setRupees(int a){
      this.a=a;
    }
    public int getRupees(){
         return a;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
       ATM obj =new ATM();
       obj.setRupees(584);
       System.out.println(obj.getRupees()); 
    }
}

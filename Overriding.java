
class parent{
  void eat(){
    
    System.out.println("maggie");
  }
}
  class child extends parent{
 void eat(){
  
      System.out.println("pasta");
      super.eat();
}
}
public class Overriding {
        public static void main(String[] args) {
        parent obj =new child();
        obj.eat();
    }
  }

    


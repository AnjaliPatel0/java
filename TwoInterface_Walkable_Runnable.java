interface Walkable{
    void walk();
    void run();
}
interface Runnable{
     void walk();
    void run();
}
    class Human implements Walkable,Runnable{
   public void walk(){
        System.out.println("human is walking");
    }
     public void run(){
        System.out.println("human is running");
    }
}

public class TwoInterface_Walkable_Runnable {
    public static void main(String[] args) {
        Human obj =new Human();
        obj.walk();
        obj.run();
    }
    
}

interface  Vehicle{
   default void start(){
  System.out.println("Vehicle is starting");
   }
    
}
class Car implements Vehicle{
   
        
}
public class Interface_vehicle {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
    }
    
}

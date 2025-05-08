class Device{
    void powerOn(){
        System.out.println("Device is  on");
    }
 }
 class Laptop extends Device{
    void boot(){
        System.out.println("Laptop is Booting");
    }
 }
 class GamingLaptop extends Laptop{
    void startGame(){
        System.out.println("GamingLaptop start the game");
    }
 }



public class Inheritance_Device_LAptop_GAmingLaptop_MultiLevel {
    public static void main(String[] args) {
        GamingLaptop GAM= new GamingLaptop();
        GAM.boot();
        GAM.powerOn();
        GAM.startGame();
        
    }
}

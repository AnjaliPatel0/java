interface Animal{
  void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("bark");
    }
}
public class Interface_Animal {
    public static void main(String[] args) {
        Dog obj =new Dog();
        obj.makeSound();
    }
    
}

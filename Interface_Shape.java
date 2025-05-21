import java.util.Scanner;

interface Shape{
    void area();
 }
class Circle implements Shape{
    public void area(float r){
        
       double area =  Math.PI*r*r;
        System.out.println("Area of cirlse is " +area);
    }
}
    
public class Interface_Shape {
    public static void main(String[] args) {
      Circle obj =new Circle();
        obj.area(5);
    }
    
}

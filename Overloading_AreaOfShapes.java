class shape{
    void Rectangle(int length ,int breath){
        System.out.println(length*breath);
    }
    void Circle( double radius){
      System.out.println(Math.PI*radius*radius);
    }
    void Triangle(float base ,float height){
        System.out.println(base*height/2);
    }
}

public class Overloading_AreaOfShapes {
    public static void main(String[] args) {
        shape obj= new shape();
        obj.Rectangle(5,7);
        obj.Circle(9.5);
        obj.Triangle(10f,4f);
    }
    
}

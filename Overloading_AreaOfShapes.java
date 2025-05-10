class shape{
    //Calculate area of rectangle
    void rectangle(int length ,int breath){
        System.out.println(length*breath);
    }
    //calculate area f Circle
    void circle( double radius){
      System.out.println(Math.PI*radius*radius);
    }
    //calculate area of triangle
    void triangle(float base ,float height){
        System.out.println(base*height/2);
    }
} 

public class Overloading_AreaOfShapes {
    public static void main(String[] args) {
        shape obj= new shape();
        obj.rectangle(5,7);
        obj.circle(9.5);
        obj.triangle(10f,4f);
    }
    
}

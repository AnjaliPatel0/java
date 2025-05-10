class Shapes{
    //area of rectangle
    void displayArea(int length,int breath){
        int area =  length *   breath;
        System.out.println("Area of Rectangle " +area);
    }
     // area of circle 
     void displayArea(double radius){
        double area = Math.PI*radius*radius;
        System.out.println("Area of Circle " +area);
     }
     //area of square
     void displayArea(int side){
        int area = side*side;
        System.out.println("Area of Square " +area);
     }
}



public class Overloading_display_DifferentShapes {
    public static void main(String[] args) {
        Shapes obj=new Shapes();
        obj.displayArea(6,8);
        obj.displayArea(6);
        obj.displayArea(6.5);
    }
    
}

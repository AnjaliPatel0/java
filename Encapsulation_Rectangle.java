class Rectangle{
    private int length;
    private int width;
    public void setRectangle(int length ,int width){
        this.length=length;
        this.width=width;
    }
    public int getArea(){
          int Area=length*width;
         return Area;
    }
    public int getPerimeter(){
        int Perimeter = 2*(length+width);
        return Perimeter;
    }
}


public class Encapsulation_Rectangle {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setRectangle(45, 65);
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
        
    }
    
}

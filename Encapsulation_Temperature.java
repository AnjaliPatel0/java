class Temperature{
    private int celsius;
    public void setcelsius(int celsius){
        this.celsius=celsius;
    }
    public int getFahrenheit(){

     int   Fahrenheit = (celsius*9/5)+32;
        return Fahrenheit;

    }
}

public class Encapsulation_Temperature {
    public static void main(String[] args) {
        Temperature obj= new Temperature();
         obj.setcelsius(67);
         System.out.println(obj.getFahrenheit());
    }
    
}

import java.util.Scanner;

public class FinallyKeyword {
    public static void main(String[] args) {
         int [] arr ={1,2,3,4};
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter A");
       int A =sc.nextInt();
       System.out.println("Enter B");
       int B =sc.nextInt();
        try {
            System.out.println("array index is");
             System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            
            System.out.println(e);
        }
        finally{
            System.out.println("all is fine");
        }
    

    }
    
}

import java.util.Scanner;

public class Error_Handling {
    public static void main(String[] args) {
       // int a=10;
       // int b=0;
       //Ex 1
       int [] arr ={1,2,3,4};
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter A");
       int A =sc.nextInt();
       System.out.println("Enter B");
       int B =sc.nextInt();
        try {
          //  int c=A/B;
            System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    

        //Ex 2

        //try {
         //   System.out.println(arr[6]);
        //}
         catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("hello");
        System.out.println("byeee");

     }
}
// Multiple catch are possible but only one catch is run with the try
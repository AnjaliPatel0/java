public class Method_sum {
   static int sum(int a ,int b ){

   return a+b;
    /*int sum = 0;
        while(a>0){
            int rem= a%10;
           
            sum = sum+rem;
            a=a/10;
        }
        System.out.print("the sum of digit " +sum);*/
    
   }
   public static void main(String[] args){
     int a=sum(5 ,7);
     //sum(123);
    System.out.println(a);

   }
    
}

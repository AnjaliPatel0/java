public class Sum_of_digit {
    public static void main(String[] args){
        int a=123;
        //int original =a;
        int sum = 0;
        while(a>0){
            int rem= a%10;

            sum = sum+rem;
            a=a/10;
        }
        System.out.print("the sum of digit " +sum);
        
    }
    
}

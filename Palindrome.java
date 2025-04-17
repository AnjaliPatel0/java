public class Palindrome {
    public static void main(String[] args){
       int a=123;
        int original=a;
        int reverse = 0;
        while(a>0){
            int rem = a%10;
            reverse=reverse*10+rem;
            a=a/10;
        }
        System.out.println("the reversed number" +reverse);
        if(original==reverse){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
    
}

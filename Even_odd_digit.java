public  class Even_odd_digit{ 

public static void main(String[] args){
    int a=123;
    //int original =a;
    //int sum = 0;
    while(a>0){
        int rem= a%10;
       if(rem%2==0){
       System.out.println("even");
       }
       else{
        System.out.println("odd");
       }
       
        a=a/10;
    }
   
    
} 
    
}

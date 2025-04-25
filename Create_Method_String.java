public class Create_Method_String {
    
 //static void main() 
    //when static keyword is used function direct call 
    //but when static is not used create object and call throgh object

     void sum(){
        
        System.out.println("hello");
    }
    public static void main(String[] args){
        Create_Method_String obj = new Create_Method_String();
        obj.sum();
        //sum();
    
    }
    
}

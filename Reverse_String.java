public class Reverse_String {
    public static void main(String[] args) {
        
        String str ="my self Anjali";
        String rev = " ";
        
        for(int i=str.length()-1;i>=0;i--){
        rev+=str.charAt(i);
        }
        System.out.println(" " +rev);
    }

    
}

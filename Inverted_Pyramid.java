public class Inverted_Pyramid {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int p=2;p<=i;p++){
                System.out.print("*");
            }
        
        System.out.println();
        }
    }
    
}

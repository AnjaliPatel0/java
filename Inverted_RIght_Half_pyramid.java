public class Inverted_RIght_Half_pyramid {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }
           // System.out.println();
        
        for(int k=5; k>=i ;k--){
            System.out.print("*");
        }
    
        System.out.println();
    }
    }
    
}

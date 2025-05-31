
public class Maltiplication_OFMatrix {
    public static void main(String[] args) {
        
        int A[][] = {{1,2,3},{3,4,5},{7,8,9}};
        int B[][] = {{1,2,3},{4,5,6},{6,7,8}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               C[i][j]=0;
                for(int k=0;k<3;k++){
                    C[i][j]+=A[i][j]*B[i][j];
                }
               // System.out.print(C[i][j] + " ");
            }
            
        }
        System.out.println("After Maltiplication Matrix is");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

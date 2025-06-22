import java.util.ArrayList;
public class Boundary_TraversalMatrix {
   static void boundaryTraversal(int[][] matrix, int n, int m) {
      //Top row
      for(int i=0;i<m;i++){
        System.out.print(matrix[0][i] + " ");
      }//Right column
      for(int i=1;i<n;i++){
         System.out.print(matrix[i][m-1] + " ");
      }//Bottom row(only if more than 1 row)
         if(n>1){
            for(int i=m-2;i>=0;i--){
                System.out.print(matrix[n-1][i] + " ");
            }
         } if(m>1){
            for(int i=n-2;i>0;i--){
                System.out.print(matrix[i][0] + " ");
            }
         }  }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12}}; 
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Boundary Traversal: " );
        boundaryTraversal(matrix,n, m);
    }
}



import java.util.Scanner;

public class DaigonalOFMAtrix {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of rows and colomn  ");
        int r =sc.nextInt();
        int c = sc.nextInt();
        if(r!=c){
            System.out.println(" the Matrix is not a square matrix");
            return;
        }
        System.out.println("Enter Elements in 2D Matrix ");
        int[][] matrix =new int[r][c];
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            matrix[i][j]=sc.nextInt();
        }
      } //Output Daigonal matrix
      System.out.println("Primary Daigonal elements ");
      for(int i =0;i<r;i++){
        System.out.println(matrix[i][i] + " ");
      }
         System.out.println("Secondary Daigonal elements ");
      for(int  i=0;i<r;i++){
        System.out.println(matrix[i][r-i-1] + " ");
      }
    }    
}

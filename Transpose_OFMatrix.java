import java.util.Scanner;

public class Transpose_OFMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of rows and colomn  ");
        int r =sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter Elements in Matrix ");
        int[][] transpose =new int[r][c];
         for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            transpose[i][j]=sc.nextInt();
        }
      }
      // for output
      System.out.println("Transpose of  given data is");
        for(int j=0;j<c;j++){
        for(int i=0;i<r;i++){
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
      }
    }
  }

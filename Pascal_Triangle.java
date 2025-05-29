import java.util.Scanner;
public class Pascal_Triangle {
    
      public static void pascalTriangle(int rows){
         int[][] triangle = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
      
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner sc =new Scanner(System.in);
        int rows = sc.nextInt();
        pascalTriangle(rows);
        
     }
}

public class SpiralTraversalofMatrix {
    
    public static void printSpiral(int[][] matrix) {
      // if (matrix == null || matrix.length == 0) return;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from Left to Right
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;

            // Traverse from Top to Bottom
            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            // Traverse from Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            // Traverse from Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  12,  3,  4 },
            { 5,  6,  7,  8 },
            { 12, 10, 11, 22 },
            {13, 14, 15, 16}
        };
        System.out.println("Print Spiral Traversal matrix");
        printSpiral(matrix);
    }
}



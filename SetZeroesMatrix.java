public class SetZeroesMatrix {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},
                         {6,0,8},
                         {9,4,5}};
       setZeroes(matrix);
       System.out.println("Matrix after setting zeroes:");
        //print result
         for(int[] row:matrix){
            for(int val: row){
                System.out.print(val + " ");
            }
                 System.out.println();    
        }
    }
        static void setZeroes(int[][] matrix){
            int r=matrix.length,c=matrix[0].length;
            boolean[] row =new boolean[r],col =new boolean[c];
            // Mark the rows and columns that have 0
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(matrix[i][j]==0){
                    row[i]=col[j] =true;
                }
            }
        }    //set row  to 0
             for(int i=0;i<r;i++){
                if(row[i]){
                for(int j=0;j<c;j++){
                matrix[i][j]=0;
             }
            }
        }    //set columns to 0
             for(int j=0;j<c;j++){
                if(col[j]){
                for(int i=0;i<r;i++){
                matrix[i][j]=0;
                }
            }
             }
        }
    }


public class BooleanMatrix {   
    // String question = """
    //         Given a boolean matrix mat where each cell contains either 0 or 1, the task is to modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.
    //         """;
       static void booleanMatrix(int mat[][]){
        int rowlen = mat.length;
        int collen = mat[0].length;

        boolean [] reqModRow = new boolean[rowlen];
        boolean[] reqModcol = new boolean[collen];

        for(int i = 0; i<rowlen; i++){
            for(int j = 0; j<collen; j++){
                if(mat[i][j] == 1){
                    reqModRow[i] = true;
                    reqModcol[j] = true;
                }
            }
        }

        for(int i = 0; i < rowlen; i++){
            for(int j = 0; j< collen; j++){
                if(reqModRow[i] || reqModcol[j]) mat[i][j] = 1; 
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { 
            { 1, 0, 0, 1 },
               { 1, 0, 0, 1 },
            { 0, 0, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } 
        };
        booleanMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
       }
    }

}

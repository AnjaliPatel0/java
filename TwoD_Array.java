public class TwoD_Array {
    public static void main(String[] args){
        int[] [] arr= {{1,3,2,4},{2,4,3,5}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

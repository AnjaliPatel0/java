public class MoveAll_NegativeNumbers_Beginning_AndPositiveToEnd {
    public static void main(String[] args) {
        int[] arr ={-5,9,4,6,-2,-3,0};
        int[] newArr= new int[arr.length];
         int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
             newArr[index++] = arr[i];
            }
        }
          for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
             newArr[index++] = arr[j];
            }
          }
        for(int k=0;k<arr.length;k++){
            if(arr[k]>0){
             newArr[index++] = arr[k];
            }
        } 
         System.out.println(" Array After Rearranging");
        for(int num:newArr){
            
            System.out.println(num + " ");
        }
     

        }
    
}

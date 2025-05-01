public class Returns_smallest_no_byMethod {
    
    static int min(int[] arr){
      int size=arr.length;
      int min = arr[0];
      for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
      }
        return min;
      
    }
   public  static void main(String[] args){
    int[] arr={5,6,7,3,2};
   int min=min(arr);
     System.out.println("minimum value " + min);
   }
    
}

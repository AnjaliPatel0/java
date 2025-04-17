public class Sum_of_twoArray_into_third_Array {
    public static void main(String[] args){
        int[] arr1 = {1,3,4,2,5};
        int[] arr2 = {1,3,2,4,5};
        int[] sum=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];      
          
    
            System.out.println("the sum is " +sum[i]);
        }
   }
    
}

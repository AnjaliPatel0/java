public class MAximum_Product_ofSubArray {
    public static int maxProductSubArray(int[] arr){ 
        int ans =arr[0];
        int max = arr[0];
        int min =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp =max;
                      max=min;
                      min=temp;
            }
            max =Math.max(arr[i],max*arr[i]);
            min =Math.min(arr[i],min*arr[i]);
            ans =Math.max(ans,max);
       }
        return ans;
    }
    public static void main(String[] args){
     int[] arr ={2,3,2,-4,4,5,6};
     System.out.println("MAximum Product of Subarray is "+maxProductSubArray(arr));
    }
}

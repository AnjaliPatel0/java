public class Kadanes_algorithm {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,-1,-3,4,-4,-6,5};
        int sum=0;
        int max=0;
        int i;
        for( i=0;i<arr.length-2;i++){
            sum=arr[i]+arr[i+1]+arr[i+2];
            if(sum>max){
                max=sum;
            }
             
        }
        System.out.println("Sum of sub array is " +sum);
        System.out.println("Sub arr is " +arr[i] +" " + arr[i+1]);
       
    
    }
    
}

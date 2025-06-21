import java.util.Arrays;
public class FindPairSum {
   public static void findPairs(int[] arr,int targetSum){
    Arrays.sort(arr);
    int left =0;
    int right =arr.length-1;
    boolean foundAnyPair=false;
    while(left<right){
        int sum = arr[left]+arr[right];
        if(sum == targetSum){
            System.out.println("(" +arr[left] + "," +arr[right] +")");
            foundAnyPair=true;
            left++;
            right--;
        }else if(sum<targetSum){
            left++;
        }else {
            right--;
        }
    }
    if(!foundAnyPair){
        System.out.println("No pairs foundwith sum " +targetSum);
    }
   } 
    public static void main(String[] args) {
        int[] arr= {1,5,7,13,-6,6,3,2};
        int targetSum=8;
        System.out.println("pairs with sum " + targetSum + " are:");
        findPairs(arr,targetSum);
    }
}

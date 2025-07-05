public class SubArrayWithGivenSum {
    public static int[] findSubarrayWithGivenSum(int[] arr, int targetSum) {
        int start = 0;
        int currentSum = 0;
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            // Shrink window from the left while the current sum is too large
            while (currentSum > targetSum && start < end) {
                currentSum -= arr[start];
                start++;
            }
            // Check if we've reached the target sum
            if (currentSum == targetSum) {
                return new int[]{start, end};
            }
        }// If no matching subarray is found
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 13;
        int[] result = findSubarrayWithGivenSum(arr, targetSum);
        if (result[0] != -1) {
            System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
        } else {
            System.out.println("No subarray with given sum found.");
        }
    }
}



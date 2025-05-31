//Q1.Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// import java.util.Arrays;
// public class Lec2 {
//     public static int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i< nums.length; i++) {
//             for(int j = i+1; j< nums.length; j++) {
//                 if(nums[i] + nums[j] == target) {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return null; // If no solution found
//     }
//     public static void main(String[] args) {
//         int[] nums = {3, 2, 4};
//         int target = 6;
//         System.out.println(Arrays.toString(twoSum(nums, target)));
//     }
// }


//Q2.Kadane's Algorithm
//Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
//A subarray is a contiguous non-empty sequence of elements within an array.
// public class Lec2 {
//     public int maxSubArray(int[] nums) {
//         int currSum = 0;
//         int maxSubArray = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             currSum += nums[i];
//             maxSubArray = Math.max(currSum, maxSubArray);
//             if (currSum < 0) {
//                 currSum = 0;
//             }
//         }
//         return maxSubArray;
//     }
//     public static void main(String[] args) {
//         Lec2 obj = new Lec2();
//         int nums[] = {1, 3, -2, -9, -5, 5, 3};
//         System.out.println("Max SubArray is:"+obj.maxSubArray(nums));
//     }
// }


//Q3.Sort an array of 0's 1's and 2's
//Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. 
//The sorting must be done in-place, without making a copy of the original array.
public class Lec2 {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid]==0){
                    int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;
                    low++;
                    mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
            int temp1 = nums[high];
            nums[high]=nums[mid];
            nums[mid]=temp1;
            high--;
            }
        }
    }
    public static void main(String[] args) {
    int nums[] = {0, 1, 1, 0, 2, 2, 1};
    Lec2 obj = new Lec2();
    obj.sortColors(nums); // Sort in-place

    System.out.print("The sorted colors are: ");
    for (int num : nums) {
        System.out.print(num + " ");
    }
}
}

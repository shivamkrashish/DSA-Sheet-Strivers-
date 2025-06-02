//Q1.Search X in sorted array
//Given a sorted array of integers nums with 0-based indexing, find the index of a specified target integer. 
//If the target is found in the array, return its index. If the target is not found, return -1.
// public class Lec1{
//     public  static int BinarySearch(int nums[],int target){
//         int left =0;
//         int right = nums.length-1;
//         while(left<=right){
//             int mid = (left+right)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             else if(nums[mid]<target){
//                 left = mid+1;
//             }
//             else{
//                 right = mid-1;
//             }
//         }
//         return  -1;
//     }
//     public static void main(String[] args) {
//         int nums[]={1,3,2,5,8,9,5};
//         int target = 8;
//         System.out.println("idx is:"+BinarySearch(nums, target));
//     }
// }


//Q2.Single element in sorted array
//Given an array nums sorted in non-decreasing order. 
//Every number in the array except one appears twice. 
//Find the single number in the array.
public class Lec1{
    public static int singleNonDuplicate(int[] nums) {
       int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Make sure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the pair is valid
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
   public static void main(String[] args) {
    int nums[] = {1, 1, 5, 5, 6, 8, 8, 9, 9};
    System.out.println("Single non-duplicate element is: " + singleNonDuplicate(nums));
}
}
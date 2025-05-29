//Q1.Largest Element
//Given an array of integers nums, return the value of the largest element in the array
// public class Lec1{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,56};
//         int largest = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(largest<arr[i]){
//                 largest = arr[i];
//             }
//         }
//          System.out.println("The largest is:"+largest);
//     }
// }
//(function me)-->
// public class Lec1{
//     public static int findLargestElement(int[] arr) {
//         int largest = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int arr[] = {3, 3, 6, 1};
//         int result = findLargestElement(arr);
//         System.out.println("Largest element: " + result);
//     }
// }


//Q2.Second Largest Element
//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
// public class Lec1{
//     public static int findSecondLargestElement(int[] arr) {
//         if (arr == null || arr.length < 2) 
//         return -1;
//         int largest = arr[0];
//         int secondlargest =arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = secondlargest;
//                 largest = arr[i];
//             }
//             else if(arr[i]>secondlargest && arr[i] != largest){
//                 secondlargest = arr[i];
//             }
//         }
//         return secondlargest;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2};
//         int result = findSecondLargestElement(arr);
//         System.out.println("Second_Largest element: " + result);
//     }
// }


//Q3.Check if Array Is Sorted and Rotated
//Given an array nums, return true if the array was originally sorted in non-decreasing order, 
//then rotated some number of positions (including zero). Otherwise, return false.
//There may be duplicates in the original array.
// public class Lec1 {
//     public boolean check(int[] nums) {
//         int count = 0;
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] > nums[(i + 1) % n]) {
//                 count++;
//             }
//         }
//         return count <= 1;
//     }
//     public static void main(String[] args) {
//         int nums[] = {2, 3, 5,1,2};
//         Lec1 obj = new Lec1();            // Create an object of Lec1
//         boolean result = obj.check(nums); // Call the non-static method using the object
//         System.out.println(result);       // Optional: print result
//     }
// }

//Q4.Remove duplicates from sorted array
//Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once.
//Return the number of unique elements in the array.
//  public class Lec1{
//     public static int removeDuplicates(int[] arr) {
//         int k = 0;  // index to insert unique element
//         for (int i = 0; i < arr.length; i++) {
//             boolean isDuplicate = false;
//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     isDuplicate = true;
//                     break;
//                 }
//             }
//             if (!isDuplicate) {
//                 arr[k++] = arr[i];  // place unique element at index k and increment k
//             }
//         }
//         return k;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 7};
//         int k = removeDuplicates(arr);
//         System.out.print("After removing duplicates: ");
//         for (int i = 0; i < k; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//Q5.Rotate Array
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class Lec1 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        // Reverse the whole array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the rest
        reverse(nums, k, n - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
    int nums[] = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    Lec1 obj = new Lec1();     // Class ka object banaya
    obj.rotate(nums, k);       // rotate() method call kiya
    // Output print kiya
    for (int num : nums) {
        System.out.print(num + " ");
    }
  }
}

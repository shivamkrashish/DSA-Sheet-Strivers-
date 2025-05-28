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
public class Lec1{
    public static int findSecondLargestElement(int[] arr) {
        if (arr == null || arr.length < 2) 
        return -1;
        int largest = arr[0];
        int secondlargest =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = secondlargest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        int result = findSecondLargestElement(arr);
        System.out.println("Second_Largest element: " + result);
    }
}

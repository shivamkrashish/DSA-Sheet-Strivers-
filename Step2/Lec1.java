//Q1.Selection Sort
//Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and return the sorted array.
//A sorted array in non-decreasing order is an array where each element is greater than or equal to all previous elements in the array.
public class Lec1 {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minpos]) {
                    minpos = j;
                }
            }
            // Swap arr[i] and arr[minpos]
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 1, 5};
        selectionSort(arr);
        printarr(arr);
    }
}

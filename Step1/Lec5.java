//Recursion
//Q1.Sum of First N Numbers
//Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.
// public class Lec5 {
//     public static int NNumbersSum(int n, int i, int sum) {
//         if (i == n) {
//             return sum + i; // include last number and return
//         }
//         return NNumbersSum(n, i + 1, sum + i); // recursive call
//     }
//     public static void main(String[] args) {
//         int result = NNumbersSum(5, 1, 0); // n = 5, start from i = 1
//         System.out.println("Sum = " + result);
//     }
// }


//Q2.Reverse an array
//Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
// public class Lec5 {
//     public static void reverse(int[] arr, int i, int n) {
//         if(i >= n / 2) {
//             return;
//         }
//         int temp = arr[i];
//         arr[i] = arr[n - i - 1];
//         arr[n - i - 1] = temp;
//         reverse(arr, i + 1, n);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5};  // ✅ Corrected
//         int n = arr.length;
//         reverse(arr, 0, n);  // ✅ Static call
//         for(int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");  // ✅ Print in same line
//         }
//     }
// }


//Q3.Check if String is Palindrome or Not
//Given a string s, return true if the string is palindrome, otherwise false.
//A string is called palindrome if it reads the same forward and backward.
// public class Lec5 {
//     public boolean isPalindrome(String s) {
//         int p1 = 0, p2 = s.length() - 1;
//         s = s.toLowerCase();
//         while (p1 < p2) {
//             char ch1 = s.charAt(p1);
//             char ch2 = s.charAt(p2);
//             // Skip non-alphanumeric characters
//             if (!((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= '0' && ch1 <= '9'))) {
//                 p1++;
//                 continue;
//             }
//             if (!((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= '0' && ch2 <= '9'))) {
//                 p2--;
//                 continue;
//             }
//             if (ch1 != ch2) {
//                 return false;
//             }
//             p1++;
//             p2--;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String s = "abccba";
//         Lec5 obj = new Lec5();
//         System.out.println(obj.isPalindrome(s));
//     }
// }


//Q4.Fibonacci Number
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
// public class Lec5 {
//     public int fib(int n) {
//         if (n <= 1) return n;
//         int a = 0, b = 1;
//         for (int i = 2; i <= n; i++) {
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//         return b;
//     }
//     public static void main(String[] args) {
//         int n = 2;
//         Lec5 obj = new Lec5(); // Create an object to call the non-static method
//         int result = obj.fib(n); // Call the method
//         System.out.println("Fibonacci number at position " + n + " is: " + result);
//     }
// }


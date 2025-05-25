// Q1.Count all Digits of a Number
// You are given an integer n. You need to return the number of digits in the number.
// The number will have no leading zeroes, except when the number is 0 itself.
// public class Lec4 {
//     public static int countDigits(int n) {
//         n = Math.abs(n); // Handle negative numbers
//         if (n == 0) return 1; // Special case for 0
//         int count = 0;
//         while (n > 0) {
//             count++;
//             n /= 10;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         System.out.println(countDigits(0));      // Output: 1
//         System.out.println(countDigits(12345));  // Output: 5
//         System.out.println(countDigits(-987));   // Output: 3
//     }
// }


//Q2.Reverse a number(Leetcode ques)
//You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
// public class Lec4{
//  public static int reverseNumber(int n) {
//         int rev =0;
//         while(n!=0){
//             int digit = n % 10;
//             // Overflow / Underflow check
//             if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
//                 return 0;
//             }
//             if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
//                 return 0;
//             }
//             rev = rev * 10 + digit;
//             n /=10;
//         }
//         return rev;
//     }
//     public static void main(String[]args){
//         System.out.println(reverseNumber(12921));
//     }
// }

//Q3. Palindrome Number(Leetcode Ques)
//You are given an integer n. You need to check whether the number is a palindrome number or not.
// Return true if it's a palindrome number, otherwise return false.
//A palindrome number is a number which reads the same both left to right and right to left.
public class Lec4 {
    public static boolean isPalindrome(int n) {
        int original_n = n;
        int rev = 0;
        if(n<0){
            return false;
        }
        while(n != 0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n /=10;
        }
        return original_n == rev;
    }
    public static void main(String[]args){
        System.out.println("Palindrom is:"+isPalindrome(1321));
    }
}

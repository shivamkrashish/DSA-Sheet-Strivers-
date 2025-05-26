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
// public class Lec4 {
//     public static boolean isPalindrome(int n) {
//         int original_n = n;
//         int rev = 0;
//         if(n<0){
//             return false;
//         }
//         while(n != 0){
//             int digit = n%10;
//             rev = rev * 10 + digit;
//             n /=10;
//         }
//         return original_n == rev;
//     }
//     public static void main(String[]args){
//         System.out.println("Palindrom is:"+isPalindrome(1321));
//     }
// }


//Q4.GCD of Two Numbers
//You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. 
//Return the GCD of the two numbers.
//The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.
// public class Lec4 {
//     public static int GCD(int n1, int n2) {
//         if(n2==0){
//             return n1;
//         }
//          return GCD(n2, n1%n2);
//     }
//     public static void main(String[]args){
//        int num1 = 6;
//         int num2 = 8;
//         int result = GCD(num1, num2);
//         System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
//     }
// }


//Q5.Check if the Number is Armstrong
//You are given an integer n. You need to check whether it is an armstrong number or not.
//Return true if it is an armstrong number, otherwise return false.
//An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
// public class Lec4 {
//     public static boolean isArmstrong(int n) {
//         int original = n;
//         int sum = 0;
//         while (n > 0) {
//             int digit = n % 10;
//             sum += digit * digit * digit;
//             n /= 10;
//         }
//         return sum == original;
//     }

//     public static void main(String[] args) {
//         int n = 103;
//         if (isArmstrong(n)) {
//             System.out.println(n + " is an Armstrong number.");
//         } else {
//             System.out.println(n + " is NOT an Armstrong number.");
//         }
//     }
// }


//Q6.Divisors of a Number
// You are given an integer n. You need to find all the divisors of n. 
//Return all the divisors of n as an array or list in a sorted order.
// A number which completely divides another number is called it's divisor.
// import java.util.ArrayList;
// import java.util.Collections;
// public class Lec4 {
//     public static ArrayList<Integer> getDivisors(int n) {
//         ArrayList<Integer> divisors = new ArrayList<>();
//         for (int i = 1; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 divisors.add(i);
//                 if (i != n / i) {
//                     divisors.add(n / i);
//                 }
//             }
//         }
//         // Sorting the divisors in ascending order
//         Collections.sort(divisors);
//         return divisors;
//     }

//     public static void main(String[] args) {
//         int n = 36;
//         ArrayList<Integer> result = getDivisors(n);
//         System.out.println("Divisors of " + n + " are: " + result);
//     }
// }


//Q7.Check for Prime Number
// You are given an integer n. You need to check if the number is prime or not. 
// Return true if it is a prime number, otherwise return false.
// A prime number is a number which has no divisors except 1 and itself.
public class Lec4{
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        int n = 7;
        boolean result = isPrime(n); 
        System.out.println(n + " is prime: " + result); 
    }
}

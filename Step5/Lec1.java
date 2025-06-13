//Q1.Largest Odd Number in a String
//You are given a string num, representing a large integer. 
// Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
// A substring is a contiguous sequence of characters within a string.
// public class Lec1{
//     public static String largestOddNumber(String num) {
//         for (int i = num.length() - 1; i >= 0; i--) {
//             char ch = num.charAt(i);
//             if ((ch - '0') % 2 == 1) { // Check if the digit is odd
//                 return num.substring(0, i + 1);
//             }
//         }
//         return "";
//     }
//     public static void main(String[] args) {
//         String num ="547";
//         System.out.println("The largestOddNum is:"+largestOddNumber(num));
//     }
// }

//Q2.Longest Common Prefix
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// public class Lec1 {
//     public static String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) return "";
//         String prefix = strs[0];
//         for (int i = 1; i < strs.length; i++) {
//             while (!strs[i].startsWith(prefix)) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//                 if (prefix.isEmpty()) return "";
//             }
//         }
//         return prefix;
//     }
//    public static void main(String[] args) {
//         String[] input = {"flower", "flow", "flight"};
//         String result = longestCommonPrefix(input);
//         System.out.println("Longest Common Prefix: " + result);
//     }
// }

//Q3.Remove Outermost Parentheses
// A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
public class Lec1{
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    result.append(ch);
                }
                balance++;
            } else {
                balance--;
                if (balance > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
  public static void main(String[]args){
    String s = "(())";
    System.out.println(removeOuterParentheses(s));
  }
}

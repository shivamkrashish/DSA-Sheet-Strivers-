//Q1.Largest Odd Number in a String
//You are given a string num, representing a large integer. 
// Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
// A substring is a contiguous sequence of characters within a string.
public class Lec1{
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) { // Check if the digit is odd
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String num ="547";
        System.out.println("The largestOddNum is:"+largestOddNumber(num));
    }
}

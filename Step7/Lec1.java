//Q1.Pow(x,n)
//Implement the power function pow(x, n) , which calculates the x raised to n i.e.
public class Lec1 {
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        while (N > 0) {
            if (N % 2 == 1) result *= x;
            x *= x;
            N /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));  // 1024.0
        System.out.println(myPow(2.0, -2));  // 0.25
        System.out.println(myPow(2.0, 0));   // 1.0
    }
}

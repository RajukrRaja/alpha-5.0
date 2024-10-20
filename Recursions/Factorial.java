// Time complexity - 0(n) 
// space complexity - 0(n)

package Recursions;

public class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}

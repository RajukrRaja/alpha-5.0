package Recursions;

public class PrintNaturalNumberSum {

    public static int PrintNaturalNumberSum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = PrintNaturalNumberSum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(PrintNaturalNumberSum(n));

    }

}

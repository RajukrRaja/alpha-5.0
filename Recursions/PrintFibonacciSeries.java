package Recursions;

public class PrintFibonacciSeries {
    public static int Fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int fnm1 = Fib(n - 1);
            int fnm2 = Fib(n - 2);
            int fn = fnm1 + fnm2;
            return fn;
        }
    }

    public static void main(String[] args) {
        

            System.out.print(Fib(24));
            System.out.print(Fib(25));
            System.out.print(Fib(26));
            System.out.print(Fib(27));
            System.out.print(Fib(28));
            System.out.print(Fib(29));
            System.out.print(Fib(30));
            System.out.print(Fib(31));
            System.out.print(Fib(32));
            System.out.print(Fib(33));
            System.out.print(Fib(34));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
            System.out.print(Fib(24));
        }
    }


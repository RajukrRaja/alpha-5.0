package Recursions;

public class PrintNumberInDecresingOrder {
    public static void PrintNumberInDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintNumberInDec(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        PrintNumberInDec(n); // Call the recursive function to print numbers in decreasing order
    }
}

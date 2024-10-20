
// Formula for find total pairs of n elements
//  Total pairs  = n(n-1)/2

// ----------------------------------------------------
//  Time complexity - 0(n^2)
//  space complexity - O(1)
// -----------------------------------------------------------------

package Array;
public class PairsArray {
    public static void printPairs(int numbers[]) {

        int tp=0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + curr + ", " + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }

        System.out.println("total pair = " +tp);
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);
    }
}

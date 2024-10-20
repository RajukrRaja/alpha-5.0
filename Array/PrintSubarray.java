// Total SubArray formula for n size array -- n(n+1)/2

// ----------------------------------------------------------------------------
// Time complexity - Operations ≈ n * (n - 1) * (n + 1) / 6 ≈ O(n^3)
// space complexity - 0(1)

// -----------------------------------------------------------------------------

package Array;

public class PrintSubarray {
    public static void printSubarray(int numbers[]) {

        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");

                }
                ts++;

                System.out.println();
            }

            System.out.println();

        }

        System.out.println("Total SubArray->" + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarray(numbers);

    }
}

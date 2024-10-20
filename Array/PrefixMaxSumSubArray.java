// Time Complexity is reduced because of prefix array 
// K wala Loop total Reduced Ho gya 
//  so FInal Time comlexity is -> 0(n^2)

// ------------------------------------------------------------------------------------------
// calculate sum by using Prefix array formula is --> prefix[end ]- prefix[start-1]
// -----------------------------------------------------------------------------------------------

package Array;

public class PrefixMaxSumSubArray {
    public static void PrefixMaxSumSubArray(int numbers[]) {
        int prefix[] = new int[numbers.length];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }

        System.out.println("Max sum - > " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        PrefixMaxSumSubArray(numbers);
    }

}
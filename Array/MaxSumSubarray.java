
// Time Complexity - > o(n^3)

// 
// 

package Array;

public class MaxSumSubarray {
    public static void maxSumSubarray(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int currSum = 0;
                int end = j;

                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println("Subarray: [" + i + ", " + j + "] Sum: " + currSum);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum SubArray Sum -> " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSumSubarray(numbers);
    }
}

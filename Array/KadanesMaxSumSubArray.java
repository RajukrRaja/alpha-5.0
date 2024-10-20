// Time Complexity - 0(n)




package Array;

public class KadanesMaxSumSubArray {
    public static void KadanesMaxSumSubArray(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our maximum subarray  Sum ->" + ms);
    }

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
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        KadanesMaxSumSubArray(numbers);

        maxSumSubarray(numbers);
    }

}

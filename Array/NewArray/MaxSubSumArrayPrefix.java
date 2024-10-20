public class MaxSubSumArrayPrefix {

    public static void maxSumArrayPrefix(int[] num) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[num.length];
        prefix[0] = num[0];
        
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int currSum = 0;

                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] num = {2, 4, -1, 6, -3, 8};
        maxSumArrayPrefix(num);
    }
}

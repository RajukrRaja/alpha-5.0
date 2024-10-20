class MaxSubarraySum {
    
    public static void MaxSumArray(int num[]) {
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        // Calculate the start
        for (int i = 0; i < num.length; i++) {
            int start = i;


            // Calculate the end and current sum
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = 0;
                
                
                // Calculate the sum from start to end (inclusive)
                for (int k = start; k <= end; k++) {
                    currSum += num[k];
                }
                
                // Update maxSum if currSum is greater
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6,8,10};
        MaxSumArray(num);
    }
}

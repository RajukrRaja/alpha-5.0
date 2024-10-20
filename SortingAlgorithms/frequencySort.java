import java.util.Arrays;

class Solution {
    public int[] frequencySort(int[] nums) {
        int[] freq = new int[202];
        int maxFreq = 0;

        // Calculate frequencies and find the maximum frequency
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] + 101]++;
            if (freq[nums[i] + 101] > maxFreq) {
                maxFreq = freq[nums[i] + 101];
            }
        }

        int index = 0;

        // Sort by frequency and value
        for (int i = 1; i <= maxFreq; i++) {
            for (int j = freq.length - 1; j >= 0; j--) {
                if (freq[j] == i) {
                    for (int k = 0; k < i; k++) {
                        nums[index++] = j - 101;
                    }
                    freq[j] = 0; // Reset frequency to zero after processing
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 4, 5, 6, 4, 2, 2, 8, 5};
        int[] sortedArray = solution.frequencySort(nums);
        System.out.println(Arrays.toString(sortedArray));
    }
}

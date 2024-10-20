//  Time complexity - n/2 + n/2^2+ n/2^4 ---- n/2^k =1 so the final  [0(logn)]
//  space complexity - O(1)

package Array;

public class BinarySearch {
    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = start + end / 2;
            // comparision
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 67;
        System.out.println("your Key is At-> " + BinarySearch(numbers, key));
    }
}

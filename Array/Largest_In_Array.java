
// Time Complexity - 0(n)
// space complexity - O(1)

package Array;

public class Largest_In_Array {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 5, 6, 2 };
        System.out.println("largest value ->  " + getlargest(numbers));
    }
}

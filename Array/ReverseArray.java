
// Time complexity - 0(n)
// space complexity - 0(1)


package Array;

public class ReverseArray {
    public static int ReverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
        return 0;
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        ReverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + "");
        }
        System.out.println();
    }
}

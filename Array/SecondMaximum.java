public class SecondMaximum {

    public static int findSecondMax(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two numbers");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            } else if (array[i] > secondMax && array[i] < firstMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 4, 45, 99, 99, 45};
        System.out.println("Second maximum element is: " + findSecondMax(array));
    }
}

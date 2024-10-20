public class NonZeroSorter {

    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 12, 0, 5, 0 };
        sortNonZeros(array);

        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sortNonZeros(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }

        for (int i = index; i < array.length; i++) {
            array[i] = 0;
        }
    }
}

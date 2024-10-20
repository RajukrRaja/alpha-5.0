

import java.util.Arrays;

public class insertAtBeginning {

    public static void insertAtBeginning(int[] array, int element) {
        // Shift elements to the right by one position
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Insert the new element at the beginning
        array[0] = element;
    }

    public static void main(String[] args) {
        int[] originalArray = {2, 3, 4, 5, 6}; // Array with space for one more element

        int newElement = 1;

        insertAtBeginning(originalArray, newElement);

        System.out.println("The array after inserting the element at the beginning: " + Arrays.toString(originalArray));
    }
}

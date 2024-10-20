
import java.util.Arrays;

public class InsertAtEnd {

    public static void insertAtEnd(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = element;
                return;
            }
        }
        System.out.println("Array is full. Cannot insert element.");
    }

    public static void main(String[] args) {
        int[] originalArray = {2, 3, 4, 5, 0};
        int newElement = 6;
        insertAtEnd(originalArray, newElement);
        System.out.println("The array after inserting the element at the end: " + Arrays.toString(originalArray));
    }
}

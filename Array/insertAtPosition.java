import java.util.Arrays;
import java.util.Scanner;

public class InsertAtPosition {

    public static void insertAtPosition(int[] array, int element, int position) {
        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position.");
            return;
        }
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = element;
    }

    public static void main(String[] args) {
        int[] originalArray = {2, 3, 4, 5, 0};
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the new element: ");
        int newElement = s.nextInt();
        
        System.out.print("Enter the position: ");
        int position = s.nextInt();
        
        insertAtPosition(originalArray, newElement, position);
        
        System.out.println("The array after inserting the element at position " + position + ": " + Arrays.toString(originalArray));
        
        s.close();
    }
}

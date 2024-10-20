import java.util.Scanner;

public class MoveCharacters {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = s.nextLine();

        char[] array = input.toCharArray();
        char toMove = 'a';

        MoveCharactersToEnd(array, toMove);

        System.out.println("Modified array: " + new String(array));
    }

    public static void MoveCharactersToEnd(char[] array, char toMove) {
        int index = 0;

        // Move non-toMove characters to the front
        for (int i = 0; i < array.length; i++) {
            if (array[i] != toMove) {
                array[index++] = array[i];
            }
        }

        // Fill the rest of the array with toMove characters
        while (index < array.length) {
            array[index++] = toMove;
        }
    }
}

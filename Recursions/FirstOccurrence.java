package Recursions;

public class FirstOccurrence {
    public static int findFirstOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1; // Key not found in the array
        }
        if (arr[i] == key) {
            return i; // Found the key at index i
        }
        return findFirstOccurrence(arr, key, i + 1); // Recursively search in the rest of the array
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 2};
        int key = 4;
        int index = findFirstOccurrence(arr, key, 0);
        
        if (index == -1) {
            System.out.println("The key " + key + " was not found in the array.");
        } else {
            System.out.println("The first occurrence of " + key + " is at index " + index + ".");
        }
    }
}

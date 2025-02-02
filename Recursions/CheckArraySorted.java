package Recursions;

public class CheckArraySorted {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true; 
        }
        if (arr[i] > arr[i + 1]) {
            return false; 
        }
        return isSorted(arr, i + 1); 
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 25, 6 };
        boolean sorted = isSorted(arr, 0);
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}

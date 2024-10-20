package SortingAlgorithms;

public class OptimizedBubbleSort {

    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swaps = 0;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }

            // If no swaps were performed in this pass, the array is already sorted.
            if (swaps == 0) {
                break;
            }

            System.out.println("Pass " + (i + 1) + ": " + swaps + " swaps");
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };
        System.out.println("Original Array:");
        PrintArray(arr);
        BubbleSort(arr);
        System.out.println("Sorted Array:");
        PrintArray(arr);
    }
}

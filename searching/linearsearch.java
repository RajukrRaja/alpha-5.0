package searching;

public class LinearSearch {
    public void linearSearch(int[] a, int x) {
        int n = a.length;  // Get the length of the array
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        int[] arr = {2, 4, 6, 8, 10};
        int x = 6;

        search.linearSearch(arr, x);
    }
}

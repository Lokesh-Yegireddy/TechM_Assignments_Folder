//  bubble sort

package Assignment_1;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

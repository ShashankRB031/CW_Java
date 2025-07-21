public class BubbleSortOptimised {

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false; // Moved here - for the whole pass
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; // Swap occurred
                }
            }
            if (!flag) {
                // No swaps in this pass — array is sorted
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 4, 8, 0};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

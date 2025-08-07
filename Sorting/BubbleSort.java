public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }

            // If no swaps were made, array is already sorted
            
            if (!flag) {   // (!flag) -> (flag == false)
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 0};

        bubbleSort(arr);

        System.out.print("Array after sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

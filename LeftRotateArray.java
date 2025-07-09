public class LeftRotateArray {

    static void printArray(int[] arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // in case k > n
        int[] temp = new int[k];

        // Store first k elements in temp
        for(int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift the rest of the elements left
        for(int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy temp to end
        for(int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        System.out.print("Original array: ");
        printArray(arr);
        leftRotate(arr, k);
        System.out.print("Array after left rotation by " + k + ": ");
        printArray(arr);
    }
}

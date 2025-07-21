public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 0, 9, 0, 3, 4, 0 };
        int n = arr.length;

        // Print original array
        System.out.print("Original array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Move zeros to end
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) { 
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print result
        System.out.println("After moving all zeros to the end:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}

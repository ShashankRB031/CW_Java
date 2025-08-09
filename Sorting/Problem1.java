public class Problem1 {

    static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void sortArray(int[] arr) {
        int n = arr.length;
        int x = -1, y = -1;

        if(n<=1) return;  //cornder case / edge case (input = 0 or 1)

        // Find the two swapped elements
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }

        // Swap x and y if found
        if (x != -1 && y != -1) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 5, 7, 8, 1};

        System.out.println("Array before fixing:");
        displayArr(arr);

        sortArray(arr);

        System.out.println("Array after fixing:");
        displayArr(arr);
    }
}

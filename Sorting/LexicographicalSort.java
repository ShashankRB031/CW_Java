public class LexicographicalSort {

    static void sortStrings(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                // Compare current minimum with arr[j]
                if (arr[j].compareTo(arr[min_index]) < 0) {
                    min_index = j;
                }
            }

            // Swap if needed
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "watermelon", "papaya", "mango"};
        sortStrings(arr);

        System.out.print("Sorted array: ");
        for (String val : arr) {
            System.out.print(val + " ");
        }
    }
}

import java.util.Scanner;

public class SquareOfSortedArray {

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n - 1; // ✅ fill from the end

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }

        return ans; // ✅ sorted in increasing order
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        int[] squaredSorted = sortSquares(arr);  // ✅ now stores result in correct order

        System.out.println("Squares in increasing order:");
        printArray(squaredSorted);
    }
}

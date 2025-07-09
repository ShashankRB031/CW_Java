import java.util.Scanner;

public class SortArrayParity {

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

    // Move all even numbers to the left, odd to the right
    static void sortArrayEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 == 1) {
                right--;
            } else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
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

        sortArrayEvenOdd(arr);

        System.out.println("Sorted by Parity (evens first, odds later):");
        printArray(arr);
    }
}

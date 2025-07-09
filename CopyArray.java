import java.util.Scanner;

public class CopyArray {

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArray(arr);

        // Accessing the same array with another reference
        int[] arr_2 = arr;
        System.out.print("Accessed with another reference (arr_2): ");
        printArray(arr_2);

        sc.close();
    }
}

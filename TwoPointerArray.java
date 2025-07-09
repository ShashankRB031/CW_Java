import java.util.Scanner;

public class TwoPointerArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void sortZeroesAndOnes(int[] arr){
        int n= arr.length;
        int left = 0,  rightr = n-1;
        while(left < rightr){
            if(arr[left] == 1 && arr[rightr] == 0){
                swap(arr, left, rightr);
                left ++;
                rightr --;

            }  

            if(arr[left] == 0){
                left ++;
            }
            if(arr[rightr] == 1){
                rightr --;
            }
        }

    }

    // static void sortZeroesAndOnes(int[] arr) {
    //     int n = arr.length;
    //     int zeroes = 0;

    //     // Count the number of zeroes
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] == 0) {
    //             zeroes++;
    //         }
    //     }

    //     // Fill array: first zeroes are 0, rest are 1
    //     for (int i = 0; i < n; i++) {
    //         if (i < zeroes) {
    //             arr[i] = 0;
    //         } else {
    //             arr[i] = 1;
    //         }
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements (only 0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        sortZeroesAndOnes(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

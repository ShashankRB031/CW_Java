import java.util.Scanner;

public class PrefixSumArray {

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");  // Changed println to print for inline display
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        for(int i = 1; i <=n; i++){  // Start from 1 to avoid i-1 going negative
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n  + " elements:");
        for(int i = 0; i < n;  i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Input Array: ");
        printArray(arr);

        int[] pref = makePrefixSumArray(arr);
        System.out.print("Prefix Sum Array: ");
        printArray(pref);

        sc.close();  // Good practice to close Scanner
    }
}

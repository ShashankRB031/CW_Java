import java.util.Scanner;

public class RangeQuery {

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Create a new prefix sum array without modifying the original array
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i = 1; i < n; i++){
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Input Array: ");
        printArray(arr);

        int[] prefSum = makePrefixSumArray(arr);
        System.out.print("Prefix Sum Array: ");
        printArray(prefSum);

        System.out.print("Enter number of Queries: ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.print("Enter Range (1-based, l r): ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            // Adjust to 0-based indexing
            int ans = prefSum[r - 1] - (l > 1 ? prefSum[l - 2] : 0);
            System.out.println("Sum = " + ans);
        }

        sc.close();
    }
}

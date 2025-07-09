import java.util.Scanner;

public class FirstRepeatingNum {

    static int firstRepeatingNumber(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1; // no repeating element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = firstRepeatingNumber(arr);
        if(result == -1) {
            System.out.println("No repeating elements found.");
        } else {
            System.out.println("First repeating element: " + result);
        }

        sc.close();
    }
}

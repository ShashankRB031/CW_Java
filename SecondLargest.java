import java.util.Scanner;

public class SecondLargest {

    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > mx) {
                mx = value;
            }
        }
        return mx;
    }

    static int findSecondMax(int[] arr){
        int max = findMax(arr);
        int secondMax = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value != max && value > secondMax) {
                secondMax = value;
            }
        }

        return secondMax;
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

        if (n < 2) {
            System.out.println("Need at least two elements to find second largest.");
        } else {
            int secondMax = findSecondMax(arr);
            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("All elements are the same. No second largest.");
            } else {
                System.out.println("Second largest element: " + secondMax);
            }
        }

        sc.close();
    }
}

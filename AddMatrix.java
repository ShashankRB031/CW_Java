import java.util.Scanner;

public class AddMatrix {

    static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input - Addition not possible");
            return;
        }

        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Result of Matrix Addition:");
        printArray(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix A
        System.out.print("Enter number of rows for Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Matrix B
        System.out.print("Enter number of rows for Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Print matrices
        System.out.println("Matrix A:");
        printArray(a);

        System.out.println("Matrix B:");
        printArray(b);

        // Try to add
        add(a, r1, c1, b, r2, c2);

        sc.close();
    }
}

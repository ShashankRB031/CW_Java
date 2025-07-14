import java.util.Scanner;

public class Increasing1TON {

    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {  // corrected method name
        System.out.print("Enter the num to get 1 to n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);  // added function call
    }
}

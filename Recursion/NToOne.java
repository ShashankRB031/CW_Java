
import java.util.Scanner;

public class NToOne {

    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printIncreasing(n - 1);
        

    }

    public static void main(String[] args) {
        System.out.print("Enter number to get n natural numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printIncreasing(n);
    }
}

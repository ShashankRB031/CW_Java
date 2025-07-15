import java.util.Scanner;

public class FactorialOfNum {

    static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get Factorial: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return; // Exit early
        }

        long result = factorial(n);
        System.out.println("✅ Factorial of " + n + " is " + result);
    }
}

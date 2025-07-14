import java.util.Scanner;

public class Decreasing1ToN {

    static void printDecreasing(int n){
        //base case
        if(n == 1){
            System.out.println(n);
            return;
        }

        // self work
        System.out.println(n);

        //recursive work 
        System.out.println(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter Numbe to print n to 1: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}

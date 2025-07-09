
import java.util.Scanner;


public class InputArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arry :");
        int n =sc.nextInt();
        int [] arr =new int [n];

        System.out.print("Enter" +n+"elements of array :");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        for(int i=0; i<n; i++){

            System.out.print(arr[i]+" ");
        }
        


    }
}

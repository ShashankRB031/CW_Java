import java.util.Scanner;
// target = sum of 2 nums 

public class PairSum{

    static int pairSum(int[] arr, int target){
        int n =arr.length;
        int ans =0;

        for(int i=0; i<n; i++){   // first num
            for(int j=i+1; j<n; j++){  // second num
                if(arr[i]+arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array aize :");
        int n =sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter "+ n + " elements : ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        System.out.print("Enter target sum : ");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));

    }
}
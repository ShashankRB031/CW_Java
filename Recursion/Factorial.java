public class Factorial {

    static int fact(int n){
        if(n == 0){
            return 1; 
        }

        int smallWork = fact(n-1);

        int ans = smallWork * n;
        return ans;

        // return  n * fact(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println(result);
    }
}

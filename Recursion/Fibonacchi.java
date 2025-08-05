public class Fibonacchi {

    static int fib(int n){
        //base case
        if(n == 0 || n == 1){
            return n;
        }

        // sub proble,m
        int prev = fib(n-1);
        int prevPrev = fib(n-2);

        // self work
        return prev + prevPrev;

    }
    public static void main(String[] args) {
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println(fib(i));
        }
        
        
    }
}

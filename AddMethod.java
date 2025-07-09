
import java.util.Scanner;

class Algebra{
    int add(int a, int b){
        int ans =a+b;
        return ans;
    }
}

public class AddMethod {
    public static void main(String[] args) {
        Algebra obj1 = new Algebra();
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        int ans = obj1.add(x, y);
        System.out.println("Sum of the numbers is :"+ ans);

        
       

    }
}

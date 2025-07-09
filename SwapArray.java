public class SwapArray {

    static void swap(int a, int b){
        System.out.println("Original values before swap:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        int temp = a;  // a=9,   b=3;
        a = b;
        b = temp;

        // without temp
        a = a+b;   //12   
        b = a-b;    // 12-3 = 9   
        a = a-b;     // 12 -9 =3 

        System.out.println("Values inside swap method after swap:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args){
        
        int a = 9;
        int b = 3;
        swap(a, b);
        
    }
}

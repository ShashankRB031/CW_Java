
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        // move or copy from one stack to other stack 
        Stack<Integer> st = new Stack<>();
        // int n ;
        // System.out.println("Enter the number of elemets to insert in Stsck : ");
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // System.out.println("Enter the elements : ");
        // for(int i=0 ; i<n; i++){
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        System.out.println( "Original : "+ st);

        //reverse order
        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){
            int x = st.peek();  //
            gt.push(x);
            st.pop();
        }
        // System.out.println(gt);
        
        Stack<Integer> rt = new Stack<>();
        while(gt.size() > 0){
            rt.push(gt.pop());
        }

        System.out.println("Copy : "+ rt);

    }
}

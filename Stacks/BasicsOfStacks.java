
import java.util.Stack;

 public class BasicsOfStacks{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); 
        System.out.println("Size :" + st.size());  // 0
        System.out.println(st);    // [] empty stack
        st.push(1);
        st.push(32);
        st.push(90);
        st.push(29);

        //peak
        System.err.println(st.peek());   //LIFO or FILO
        System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        System.out.println("Size :" + st.size());

        while(st.size() > 2){
            st.pop();
        }
        System.out.println("Peak : " + st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty()); 
    }


 }
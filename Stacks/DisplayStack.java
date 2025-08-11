import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();  
        st.push(1); // push 1
        st.push(2); // push 2
        st.push(3); // push 3
        st.push(4); // push 4
        st.push(5); // push 5
        System.out.println(st); // print original stack

        Stack<Integer> rt = new Stack<>(); // temp stack to reverse
        while(st.size() > 0){ // move all elements to temp
            rt.push(st.pop()); // pop from st, push to rt
        }

        while(rt.size() > 0){ // move back to original and display
            int x = rt.pop(); // pop from temp
            System.out.print(x +" "); // display element
            st.push(x); // restore to original stack
        }

    }
}

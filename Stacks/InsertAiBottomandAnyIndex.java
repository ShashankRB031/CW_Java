import java.util.Stack;

public class InsertAiBottomandAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); // push 1
        st.push(2); // push 2
        st.push(3); // push 3
        st.push(4); // push 4
        st.push(5); // push 5
        System.out.println(st); // print original stack

        int idx = 2; // index to insert at (0-based from bottom)
        int x = 6;   // element to insert

        Stack<Integer> temp = new Stack<>(); // temp stack
        while(st.size() > idx){ // pop until target index
            temp.push(st.pop()); // move elements to temp
        }

        st.push(x); // push new element at index

        while(temp.size() > 0){ // move elements back
            st.push(temp.pop()); // restore from temp
        }
        System.out.println(st); // print updated stack
    }
}

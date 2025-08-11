import java.util.Stack;

public class ReverseStackByRecursion {

    // Push element at bottom of the stack
    public static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    // Reverse stack recursively
    public static void displayRevRec(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int top = st.pop();
        displayRevRec(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        displayRevRec(st);

        System.out.println("Reversed stack: " + st);
    }
}

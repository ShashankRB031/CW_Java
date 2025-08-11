public class StackByLL {
    public static class Node { // user-defined data type
        int val;
        Node next;
        Node(int val) { // fixed constructor
            this.val = val;
        }
    }

    public static class LLStack {  // user-defined data structure
        Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--; // decrement size
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next; // move forward
            }
            System.out.println();
        }

        int size() {  // getter
            return size;
        }

        boolean isEmpty() {
            if (size == 0) return true; // fixed syntax
            else return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack(); // fixed type

        st.push(4);
        st.display(); // 4
        st.push(5);
        st.display(); // 5 4
        st.push(1);
        st.display(); // 1 5 4
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); // 5 4
        System.out.println(st.size()); // 2
        st.push(7);
        st.push(0);
        st.display(); // 0 7 5 4
    }
}

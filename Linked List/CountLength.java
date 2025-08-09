public class CountLength {

    // Display linked list
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Count length of linked list
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // Node class
    public static class Node {
        int data;   // value
        Node next;  // address of next node

        // constructor
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);   // head node 
        Node b = new Node(6);  
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        // Linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        System.out.println("Length: " + length(a));
    }
}

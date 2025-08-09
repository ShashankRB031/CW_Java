public class DisplayByRecursively {

    // Print list in forward order
    public static void displayr(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);
    }

    // Print list in reverse order
    public static void displayreverse(Node head) {
        if (head == null) return;
        displayreverse(head.next); 
        System.out.print(head.data + " ");
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
        Node f = new Node(100);

        // Linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Display forward
        displayr(a);
        System.out.println();

        // Display reverse
        displayreverse(a);
    }
}

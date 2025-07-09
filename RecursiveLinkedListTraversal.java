public class RecursiveLinkedListTraversal {

    public static void displayR(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(100);

        // Link the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Recursive display
        displayR(a);
    }
}

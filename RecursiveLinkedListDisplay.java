
public class RecursiveLinkedListDisplay {

    public static void displayr(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);
    }

    public static void displayreverse(Node head) {
        if (head == null) return;
        displayreverse(head.next);
        System.out.print(head.data + " ");
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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print("Normal: ");
        displayr(a); // Output: 5 3 9 8 100

        System.out.print("\nReverse: ");
        displayreverse(a); // Output: 100 8 9 3 5
    }
}

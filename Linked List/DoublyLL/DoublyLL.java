public class DoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void displayAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next; // forward traversal from head
        }
        System.out.println();
    }

    public static void displayAllrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev; // backward traversal from tail
        }
        System.out.println();
    }

    public static void displayNodRandom(Node random) {
    Node temp = random;
    // move temp backwards to the head
    while (temp.prev != null) {
        temp = temp.prev;
    }
    // print the list from head
    while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
    }
    System.out.println();
}

    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        displayAll(a);
        displayAllrev(e);
        displayNodRandom(e);
    }
}

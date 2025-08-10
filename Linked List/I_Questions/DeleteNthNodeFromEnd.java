public class DeleteNthNodeFromEnd {

    public static Node deleteNthFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;

        // Move fast ahead by n steps
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // If fast becomes null, we are deleting the head
        if (fast == null) {
            return head.next;
        }

        // Move both pointers until fast reaches last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete the node
        slow.next = slow.next.next;

        return head;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Before deletion:");
        display(a);

        a = deleteNthFromEnd(a, 4); // Delete 2nd node from end

        System.out.println("After deletion:");
        display(a);
    }
}

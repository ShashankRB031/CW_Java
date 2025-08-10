public class NthNodefromEnd {

    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;

        // First loop: find size of linked list
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int m = size - n + 1; // m-th node from start

        // Reset temp back to head before second loop
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n ; i++){
            fast=fast.next;
        }
        while(fast !=null){
            slow = slow.next;
            fast=fast.next;
        }
        return slow;
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

        Node result = nthNode(a, 2); // Example: 2nd node from end
        Node q = nthNode2(a, 3);
        System.out.println(q.data);
        System.out.println(result.data); // Should print 300
    }
}

public class ImplementSingleLL {

    // Node class
    public static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }

    // Linked List class
    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // Insert a node at the end
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {  // if list is empty
                head = temp;
                tail = temp;     // both head and tail point to first node
            } else {
                tail.next = temp; // link last node to new node
                tail = temp;      // update tail to new last node
            }
        }

        // Display the list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.display(); // Output: 4 3 2
    }
}

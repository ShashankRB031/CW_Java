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
        int size = 0;

        // Insert a node at the end
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {  
                head = tail = temp; // first node
            } else {
                tail.next = temp; // link last node to new node
                tail = temp;      // move tail
            }
            size++;
        }

        // Insert at beginning
        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) { 
                head = tail = temp;
            } else {    
                temp.next = head;
                head = temp;
            }
            size++;
        }

        // Insert at given index
        void insertAtIndex(int idx, int val) {
            if (idx < 0 || idx > size) { // validate
                System.out.println("Wrong Index");
                return;
            }
            if (idx == 0) {
                insertAtBeginning(val);
                return;
            }
            if (idx == size) {
                insertAtEnd(val);
                return;
            }
            Node temp = head;
            // stop at node just before the index
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        
        // Get value at index
        int getAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Delete node at index
        void deleteAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Wrong Index");
                return;
            }
            if (idx == 0) { // deleting head
                head = head.next;
                if (head == null) tail = null; // list empty
                size--;
                return;
            }
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size - 1) { // deleting tail
                tail = temp;
            }
            size--;
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
        ll.insertAtBeginning(33);
        ll.insertAtEnd(4);
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.display(); 

        System.out.println(ll.size);
        ll.insertAtEnd(33);
        ll.display();
        System.out.println(ll.size);

        ll.insertAtBeginning(9);
        ll.display();

        ll.insertAtIndex(2, 11);
        ll.display();

        System.out.println(ll.getAt(-9)); // Wrong Index
        System.out.println(ll.size);
        
        ll.deleteAt(1);
        ll.display();
    }
}

public class BasicsLL {

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

        // Print the linked list
        Node temp = a;
        
        // for(int i = 1 ; i<=5 ; i++){
        //     System.out.print(temp.data + "-> ");
        //     temp = temp.next;
        // }
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        
    }

    // Method to print linked list
    
}

import java.util.ArrayList;  

public class ArrayLists {
    public static void main(String[] args) {
        
        // Wrapper classes 
        Integer in = Integer.valueOf(4);  // Boxing: primitive -> object
        System.out.println(in);          

        Float f = Float.valueOf(3.00f);  // Boxing for float
        System.out.println(f);          

        // Using Integer wrapper class with ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        // Adding elements 
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println(l1.get(1));  // 20
        System.out.println("ArrayList: " + l1);  // [10, 20, 30]

        // Get element at index 2
        System.out.println(l1.get(2));  // 30

        // Loop through the list
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        // Adding element at index 1
        l1.add(1, 100); // [10, 100, 20, 30]
        System.out.println("After adding 100 at index 1: " + l1);

        // Modifying element at index 1
        l1.set(1, 90); // [10, 90, 20, 30]
        System.out.println("After setting index 1 to 90: " + l1);

        // Remove by index
        l1.remove(1); // removes 90
        System.out.println("After removing index 1: " + l1);  // [10, 20, 30]

        // Remove by value
        l1.remove(Integer.valueOf(20));
        System.out.println("After removing value 20: " + l1); // [10, 30]

        // Trying to remove a value not in the list (no error)
        l1.remove(Integer.valueOf(200));
        System.out.println("After trying to remove 200 (not in list): " + l1); // [10, 30]

        // Check if element exists
        boolean ans = l1.contains(Integer.valueOf(10));
        System.out.println("Contains 10? " + ans);  // true

        boolean ans1 = l1.contains(Integer.valueOf(1000));
        System.out.println("Contains 1000? " + ans1);  // false

        // Raw ArrayList (no type specified, can add anything)
        ArrayList l2 = new ArrayList();
        l2.add(1);
        l2.add(true);  // ✅ added semicolon
        l2.add("hello");

        System.out.println("Raw ArrayList l2: " + l2);
    }
}

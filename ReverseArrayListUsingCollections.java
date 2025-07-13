import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListUsingCollections {

    public static void main(String[] args) {

        // Integer ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(30);
        
        System.out.println("Original Integer list: " + list);

        // Sort in ascending order
        Collections.sort(list);
        System.out.println("Sorted in Ascending order: " + list);

        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted in Descending order: " + list);


        // String ArrayList
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("My YT Channel");

        System.out.println("\nOriginal String list: " + l1);

        // Sort in ascending (lexicographical) order
        Collections.sort(l1);
        System.out.println("Sorted in Ascending order: " + l1);

        // Sort in descending (reverse lexicographical) order
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Sorted in Descending order: " + l1);
    }
}

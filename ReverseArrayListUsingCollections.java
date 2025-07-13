import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListUsingCollections {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(30);
        
        System.out.println("List before sorting: " + list);

        // Sort in ascending order
        Collections.sort(list);
        System.out.println("After sorting in Ascending order: " + list);

        // Sort in descending order using reverseOrder()
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting in Descending order: " + list);
    }
}

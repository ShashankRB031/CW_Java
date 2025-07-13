import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListUsingCollections {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("Before reversing: " + list);

        // Using Collections.reverse() to reverse the ArrayList in-place
        Collections.reverse(list);

        System.out.println("After reversing: " + list);
    }
}

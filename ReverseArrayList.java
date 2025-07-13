import java.util.ArrayList;

public class ReverseArrayList {

    // Method to reverse the ArrayList
    public static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;

        // Loop until the two pointers meet
        while (i < j) {
            // Swapping elements at index i and j
            Integer temp = list.get(i);      // Step 1: Store list[i] in temp
            list.set(i, list.get(j));        // Step 2: Set list[i] = list[j]
            list.set(j, temp);               // Step 3: Set list[j] = temp (original list[i])

            // Move the pointers
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("Before reversing: " + list);
        reverseList(list);
        System.out.println("After reversing: " + list);
    }
}

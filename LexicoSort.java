public class LexicoSort {
    public static void main(String[] args) {
        String[] fruits = { "papaya", "lime", "watermelon", "apple", "mango", "kiwi" };
        int n = fruits.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[minIdx]) < 0) {
                    minIdx = j;
                }
            }

            // Swap
            String temp = fruits[i];
            fruits[i] = fruits[minIdx];
            fruits[minIdx] = temp;
        }

        // Output the result
        System.out.println("Fruits sorted in lexicographical order:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}

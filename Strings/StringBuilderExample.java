public class StringBuilderExample {
    public static void main(String[] args) {

        // Create a StringBuilder object with initial text
        StringBuilder str = new StringBuilder("hello");

        // Change the first character from 'h' to 'm'
        // hello → mello
        str.setCharAt(0, 'm');
        System.out.println(str); // Output: mello

        // Insert the character 'o' at index 3
        // Index positions: m (0) e (1) l (2) l (3) o (4)
        // mello → melolo
        str.insert(3, 'o');
        System.out.println(str); // Output: melolo

        // Delete the character at index 5
        // melolo → melol (removes the last 'o')
        str.deleteCharAt(5);
        System.out.println(str); // Output: melol

        StringBuilder sb = new StringBuilder("Shashank");
        System.out.println(sb);
        sb.reverse();    // reverseing the strinng 
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(3 ,6);  // 3 to 5 will delete
        System.out.println(sb);
    }
}

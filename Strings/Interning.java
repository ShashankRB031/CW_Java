public class Interning {
    public static void main(String[] args) {
        // Both are string literals, stored in the String Pool (inside heap)
        String x = "Hello"; // x → points to "Hello" in String Pool
        String y = "Hello"; // y → also points to same "Hello" in String Pool

        // At this point:
        // String Pool contains only one "Hello"
        // Both x and y refer to that same object

        // Reassign y to point to a new literal "Mello"
        // "Mello" is also stored in the String Pool
        y = "Mello"; // y now → points to "Mello", x still → "Hello"

        // Print the values
        System.out.println(x); // Output: Hello
        System.out.println(y); // Output: Mello

        /*
        Memory Diagram after reassignment:
        
        String Pool:
            "Hello"  ← x
            "Mello"  ← y

        Key Points:
        1. String literals are INTERNED (stored in a shared pool).
        2. Strings are IMMUTABLE (you can't change the original object).
        3. Reassigning a String variable only changes the reference, not the object.
        */
    }
}

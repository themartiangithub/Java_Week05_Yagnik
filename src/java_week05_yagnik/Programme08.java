package java_week05_yagnik;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme08 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add the numbers 4, 7, and 8 to the set
        set.add(4);
        set.add(7);
        set.add(8);

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Print the numbers between 1 and 10 that are in the set
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}

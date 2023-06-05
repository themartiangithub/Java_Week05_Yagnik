package java_week05_yagnik;

import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme09 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> people = new HashMap<>();

        // Add some people to the map
        people.put("John", 30);
        people.put("Mary", 25);
        people.put("Peter", 40);

        // Iterate through the map and print the values
        for (String key : people.keySet()) {
            System.out.println(key + " is " + people.get(key));
        }
    }
}

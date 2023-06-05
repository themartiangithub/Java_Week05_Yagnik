package java_week05_yagnik;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme10 {
    public static void main(String[] args) {
        // Create a HashMap to store the stations and their lines
        HashMap<String, String> stations = new HashMap<>();

        // Add the Zone 1 stations to the map
        stations.put("Aldgate", "Circle, District");
        stations.put("Bank", "Central, DLR, Jubilee, Northern");
        stations.put("Bond Street", "Central, Jubilee");
        stations.put("Canary Wharf", "Jubilee");
        stations.put("Charing Cross", "Bakerloo, Circle, District, Northern");
        stations.put("Embankment", "Circle, District, Jubilee");
        stations.put("Euston", "Circle, Hammersmith & City, Metropolitan, Northern");
        stations.put("Green Park", "Circle, District, Piccadilly");
        stations.put("Liverpool Street", "Central, Circle, District, Hammersmith & City, Metropolitan, Overground");
        stations.put("Oxford Circus", "Bakerloo, Central, Victoria");
        stations.put("Piccadilly Circus", "Bakerloo, Piccadilly");
        stations.put("St. Paul's", "Central");
        stations.put("Temple", "Circle, District");
        stations.put("Victoria", "Circle, District, Victoria");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a station name
        System.out.print("Enter a station name: ");
        String stationName = scanner.nextLine();

        // Check if the station is in the map
        if (stations.containsKey(stationName)) {
            // Print the lines that pass through the station
            System.out.println("The following lines pass through " + stationName + ":");
            for (String line : stations.get(stationName).split(",")) {
                System.out.println(line);
            }
        } else {
            // Station not found
            System.out.println("Station not found in Zone 1.");
        }
    }
}

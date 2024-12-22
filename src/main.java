import java.util.Arrays;

/**
 * Main class that demonstrates the usage of inheritance and polymorphism.
 * It creates different gemstones, calculates their total weight and value,
 * sorts them by value, and filters them by transparency.
 */
public class Main {
    public static void main(String[] args) {
        // Creating gemstone objects with different properties (name, weight, value, transparency)
        Gemstone gemstone1 = new PreciousGemstone("Ruby", 1.0, 3000.0, 0.85); // Precious gemstone
        Gemstone gemstone2 = new SemiPreciousGemstone("Sapphire", 2.0, 1500.0, 0.8); // Semi-precious gemstone
        Gemstone gemstone3 = new PreciousGemstone("Diamond", 1.2, 5000.0, 0.9); // Precious gemstone
        Gemstone gemstone4 = new SemiPreciousGemstone("Emerald", 1.5, 1200.0, 0.95); // Semi-precious gemstone

        // Array of gemstones for further processing
        Gemstone[] gemstones = {gemstone1, gemstone2, gemstone3, gemstone4};

        // Calculating the total weight and value of all gemstones
        double totalWeight = 0;
        double totalValue = 0;

        // Loop through each gemstone to sum their weight and value
        for (Gemstone gemstone : gemstones) {
            totalWeight += gemstone.calculateWeight(); // Add gemstone's weight to total weight
            totalValue += gemstone.calculateValue();   // Add gemstone's value to total value
        }

        // Displaying the total weight and value of all gemstones
        System.out.println("\n\033[1;34mTotal Weight & Value:\033[0m"); // Blue colored header for section
        System.out.printf("\033[1;32mTotal weight:\033[0m %.2f carats\n", totalWeight); // Green colored text for weight
        System.out.printf("\033[1;32mTotal value:\033[0m %.2f USD\n", totalValue); // Green colored text for value

        // Sorting gemstones by value using the ValueComparator
        Arrays.sort(gemstones, new Gemstone.ValueComparator());

        // Displaying sorted gemstones by value
        System.out.println("\n\033[1;34mSorted by value:\033[0m"); // Blue colored header for section
        for (Gemstone gemstone : gemstones) {
            System.out.println(gemstone); // Print each gemstone's details
        }

        // Filtering gemstones by transparency within a specified range
        double minTransparency = 0.85; // Minimum transparency threshold
        double maxTransparency = 1.0;  // Maximum transparency threshold
        System.out.println("\n\033[1;34mGems with transparency in range [" + minTransparency + ", " + maxTransparency + "]:\033[0m"); // Display filter criteria
        for (Gemstone gemstone : gemstones) {
            // Check if the gemstone's transparency falls within the specified range
            if (gemstone.isInTransparencyRange(minTransparency, maxTransparency)) {
                System.out.println(gemstone); // Print gemstone if it meets the transparency criteria
            }
        }
    }
}

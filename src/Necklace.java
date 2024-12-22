import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a necklace made up of gemstones.
 * This class manages a collection of gemstones and provides functionality
 * to calculate the total weight and value of the necklace, as well as filter gemstones by transparency.
 */
public class Necklace {
    
    // List to store gemstones that are part of the necklace
    private List<Gemstone> gemstones;
    
    /**
     * Constructor to initialize a necklace with an empty list of gemstones.
     */
    public Necklace() {
        gemstones = new ArrayList<>();
    }

    /**
     * Adds a gemstone to the necklace.
     * 
     * @param gemstone The gemstone to add to the necklace.
     */
    public void addGemstone(Gemstone gemstone) {
        gemstones.add(gemstone);
    }

    /**
     * Calculates the total weight of the necklace by summing the weight of all gemstones.
     *
     * @return The total weight of the necklace in carats.
     */
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Gemstone gemstone : gemstones) {
            totalWeight += gemstone.calculateWeight();
        }
        return totalWeight;
    }

    /**
     * Calculates the total value of the necklace by summing the value of all gemstones.
     *
     * @return The total value of the necklace in USD.
     */
    public double calculateTotalValue() {
        double totalValue = 0;
        for (Gemstone gemstone : gemstones) {
            totalValue += gemstone.calculateValue();
        }
        return totalValue;
    }

    /**
     * Filters gemstones in the necklace based on transparency.
     * 
     * @param minTransparency The minimum transparency to filter gemstones.
     * @param maxTransparency The maximum transparency to filter gemstones.
     * @return A list of gemstones whose transparency falls within the specified range.
     */
    public List<Gemstone> filterByTransparency(double minTransparency, double maxTransparency) {
        List<Gemstone> filteredGemstones = new ArrayList<>();
        for (Gemstone gemstone : gemstones) {
            if (gemstone.isInTransparencyRange(minTransparency, maxTransparency)) {
                filteredGemstones.add(gemstone);
            }
        }
        return filteredGemstones;
    }

    /**
     * Provides a string representation of the necklace, showing all gemstones and their details.
     * 
     * @return A string representing the necklace with details of all gemstones.
     */
    @Override
    public String toString() {
        StringBuilder necklaceDetails = new StringBuilder("Necklace with gemstones:\n");
        for (Gemstone gemstone : gemstones) {
            necklaceDetails.append(gemstone.toString()).append("\n");
        }
        return necklaceDetails.toString();
    }
}

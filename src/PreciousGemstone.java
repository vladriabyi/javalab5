/**
 * Class representing a precious gemstone.
 * Inherits from the Gemstone class and represents gemstones that are considered precious,
 * such as diamonds, rubies, and sapphires.
 */
public class PreciousGemstone extends Gemstone {
    
    /**
     * Constructor to initialize the precious gemstone with its specific properties.
     * Calls the parent constructor of the Gemstone class.
     *
     * @param name The name of the gemstone (e.g., "Diamond").
     * @param weight The weight of the gemstone in carats.
     * @param value The value of the gemstone in USD.
     * @param transparency The transparency of the gemstone (0 to 1).
     */
    public PreciousGemstone(String name, double weight, double value, double transparency) {
        // Calling the superclass (Gemstone) constructor to initialize the gemstone
        super(name, weight, value, transparency);
    }

    /**
     * Overridden method to calculate the weight of the gemstone.
     * In this case, the precious gemstone may have some special rules for weight calculation
     * (but in this example, it returns the weight as is).
     *
     * @return The weight of the gemstone.
     */
    @Override
    public double calculateWeight() {
        // Precious gemstones can be treated differently if needed; for now, it returns the weight directly
        return super.calculateWeight();
    }

    /**
     * Overridden method to calculate the value of the gemstone.
     * Precious gemstones are typically more valuable, so this method can be customized further.
     * In this example, the value remains as it is, but additional calculations can be added.
     *
     * @return The value of the gemstone.
     */
    @Override
    public double calculateValue() {
        // Precious gemstones are usually of higher value, but for simplicity, this returns the original value
        return super.calculateValue();
    }

    /**
     * String representation of the precious gemstone.
     * This method is overridden to provide a specific format for displaying the gemstone details.
     *
     * @return A string representation of the precious gemstone's name, weight, value, and transparency.
     */
    @Override
    public String toString() {
        return "Precious " + super.toString(); // Adds "Precious" before the gemstone details
    }
}

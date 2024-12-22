import java.util.Comparator;

/**
 * Abstract class representing a generic gemstone.
 * Contains properties such as name, weight, value, and transparency,
 * and provides methods to calculate the weight, value, and check transparency range.
 * This class also defines a comparator for sorting gemstones by their value.
 */
public abstract class Gemstone {
    private String name; // The name of the gemstone (e.g., "Diamond")
    private double weight; // The weight of the gemstone in carats
    private double value; // The value of the gemstone in USD
    private double transparency; // The transparency of the gemstone (from 0 to 1)

    /**
     * Constructor to initialize the gemstone with its name, weight, value, and transparency.
     *
     * @param name The name of the gemstone.
     * @param weight The weight of the gemstone in carats.
     * @param value The value of the gemstone in USD.
     * @param transparency The transparency of the gemstone (0 to 1).
     */
    public Gemstone(String name, double weight, double value, double transparency) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.transparency = transparency;
    }

    /**
     * Getter for the name of the gemstone.
     *
     * @return The name of the gemstone.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the weight of the gemstone.
     *
     * @return The weight of the gemstone in carats.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Getter for the value of the gemstone.
     *
     * @return The value of the gemstone in USD.
     */
    public double getValue() {
        return value;
    }

    /**
     * Getter for the transparency of the gemstone.
     *
     * @return The transparency of the gemstone (from 0 to 1).
     */
    public double getTransparency() {
        return transparency;
    }

    /**
     * Method to calculate the weight of the gemstone.
     * This method can be overridden in subclasses if needed (e.g., for additional processing).
     *
     * @return The weight of the gemstone.
     */
    public double calculateWeight() {
        return weight;
    }

    /**
     * Method to calculate the value of the gemstone.
     * This method can be overridden in subclasses if needed (e.g., for additional processing).
     *
     * @return The value of the gemstone.
     */
    public double calculateValue() {
        return value;
    }

    /**
     * Method to check if the gemstone's transparency is within a specified range.
     *
     * @param minTransparency The minimum transparency threshold.
     * @param maxTransparency The maximum transparency threshold.
     * @return True if the gemstone's transparency is within the range, false otherwise.
     */
    public boolean isInTransparencyRange(double minTransparency, double maxTransparency) {
        return transparency >= minTransparency && transparency <= maxTransparency;
    }

    /**
     * Overridden toString method to provide a string representation of the gemstone.
     *
     * @return A string representation of the gemstone's name, weight, value, and transparency.
     */
    @Override
    public String toString() {
        return "Gemstone{name='" + name + "', weight=" + weight + ", value=" + value + ", transparency=" + transparency + "}";
    }

    /**
     * Comparator class for sorting gemstones by their value.
     * This comparator sorts gemstones in descending order of value.
     */
    public static class ValueComparator implements Comparator<Gemstone> {
        /**
         * Compares two gemstones by their value.
         * Sorts in descending order of value.
         *
         * @param g1 The first gemstone to compare.
         * @param g2 The second gemstone to compare.
         * @return A negative integer, zero, or a positive integer as the first gemstone's value
         *         is less than, equal to, or greater than the second gemstone's value.
         */
        @Override
        public int compare(Gemstone g1, Gemstone g2) {
            return Double.compare(g2.getValue(), g1.getValue()); // Sorting in descending order
        }
    }
}

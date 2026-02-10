package entities;

/**
 * Represents a scale conversion utility.
 *
 * Converts raw analog values into a percentage-based scale.
 *
 * @author João Vitor Kasteller Debeterco
 * @version Version 1.0
 */
public class ScaleConverter {

    private double bruteValue;

    /**
     * Creates a ScaleConverter with the given raw value.
     *
     * @param bruteValue raw input value
     */
    public ScaleConverter(double bruteValue) {
        this.bruteValue = bruteValue;
    }

    public double getBruteValue() {
        return bruteValue;
    }
    public void setBruteValue(double bruteValue) {
        this.bruteValue = bruteValue;
    }

    /**
     * Converts the raw value to a percentage scale (0–100).
     *
     * @return converted value in percentage
     */
    public double convertScale() {
        return bruteValue = (bruteValue / 1023.0) * 100;
    }
}

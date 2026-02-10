package entities;

/**
 * Represents a Production entity.
 *
 * Stores production values and provides methods
 * to calculate cumulative and average production metrics.
 *
 * @author João Vitor Kasteller Debeterco
 * @version Version 1.0
 */
public class Production {

    private Integer productionValue;

    /**
     * Creates a Production instance with the given value.
     *
     * @param productionValue the production value
     */
    public Production(Integer productionValue) {
        this.productionValue = productionValue;
    }

    public Integer getProductionValue() {
        return productionValue;
    }
    public void setProductionValue(Integer productionValue) {
        this.productionValue = productionValue;
    }

    /**
     * Adds the current production value to an accumulated sum.
     *
     * @param sum current accumulated sum
     * @return updated sum
     */
    public int sumOfProduction(int sum) {
        return sum += productionValue;
    }

    /**
     * Calculates the average production based on a fixed divisor.
     *
     * @param sum accumulated production sum
     * @param average placeholder for average calculation
     * @return calculated average production
     */
    public Double averageOfProduction(int sum, double average) {
        return average = sum / 5;
    }
}

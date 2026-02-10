package entities;

/**
 * Represents an operational value entity.
 *
 * Used to evaluate binary or conditional operating states.
 *
 * @author João Vitor Kasteller Debeterco
 * @version Version 1.0
 */
public class Values {

    private int listValues;

    /**
     * Creates a Values instance with the specified value.
     *
     * @param listValues operational value
     */
    public Values(int listValues) {
        this.listValues = listValues;
    }

    public int getListValues() {
        return listValues;
    }
    public void setListValues(int listValues) {
        this.listValues = listValues;
    }

    /**
     * Evaluates whether the system is operating.
     *
     * @return true if operating condition is met, otherwise false
     */
    public boolean operatingValues() {
        return listValues == 1;
    }
}

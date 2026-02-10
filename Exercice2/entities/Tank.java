package entities;

/**
 * Represents a Tank entity.
 *
 * Encapsulates the tank level and provides basic safety checks
 * based on predefined threshold values.
 *
 * @author João Vitor Kasteller Debeterco
 * @version Version 1.0
 */
public class Tank {

    private Integer tankLevel;

    /**
     * Creates a Tank with the specified level.
     *
     * @param tankLevel the initial tank level
     */
    public Tank(Integer tankLevel) {
        this.tankLevel = tankLevel;
    }

    public Integer getTankLevel() {
        return tankLevel;
    }

    /**
     * Updates the tank level.
     *
     * @param tankLevel new tank level
     */
    public void setTankLevel(Integer tankLevel) {
        this.tankLevel = tankLevel;
    }

    /**
     * Performs a safety check based on the tank level.
     *
     * Displays alerts for critical, low, or stable operating conditions.
     */
    public void tankSecurity() {
        if (getTankLevel() >= 90) {
            System.out.println("ALERT: Critical level - Open drain valve!");
        } else if (getTankLevel() < 10) {
            System.out.println("ALERT: Low level - Activate pump inflation!");
        } else {
            System.out.println("Stable system");
        }
    }
}

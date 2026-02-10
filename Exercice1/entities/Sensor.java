package entities;

/**
 * Represents a Sensor entity.
 *
 * Encapsulates the sensor name and its measured value.
 * Provides accessors and a string representation of the object.
 */
public class Sensor {

    /** Sensor identifier */
    private String sensorName;

    /** Measured sensor value */
    private Double sensorValue;

    /**
     * Creates a Sensor with the given name and value.
     *
     * @param sensorName  the sensor name
     * @param value the measured value
     */
    public Sensor(String sensorName, Double sensorValue) {
        this.sensorName = sensorName;
        this.sensorValue = sensorValue;
    }

    /**
     * Returns the sensor name.
     *
     * @return sensor name
     */
    public String getSensorName() {
        return sensorName;
    }

    /**
     * Updates the sensor name.
     *
     * @param name new sensor name
     */
    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    /**
     * Returns the sensor value.
     *
     * @return sensor value
     */
    public Double getSensorValue() {
        return sensorValue;
    }

    /**
     * Updates the sensor value.
     *
     * @param value new sensor value
     */
    public void setSensorValue(Double sensorValue) {
        this.sensorValue = sensorValue;
    }

    /**
     * Returns a formatted string representation of the sensor.
     *
     * @return formatted sensor description
     */
    @Override
    public String toString() {
        return String.format(
            "Sensor[name=%s, value=%.2f units]",
            sensorName,
            sensorValue
        );
    }
}

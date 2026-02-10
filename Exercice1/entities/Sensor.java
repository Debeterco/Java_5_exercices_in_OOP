package entities;

/**
 * Represents a Sensor entity.
 *
 * Encapsulates the sensor name and its measured value.
 * Provides accessors and a string representation of the object.
 * @author João Vitor Kasteller Debeterco
 * @version Version 1.0
 */
public class Sensor {

    private String sensorName;
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

    public String getSensorName() {
        return sensorName;
    }

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
            getSensorName(),
            getSensorValue()
        );
    }
}

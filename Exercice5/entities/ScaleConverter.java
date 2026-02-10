package entities;

public class ScaleConverter {
    private double bruteValue;

    public ScaleConverter(double bruteValue) {
        this.bruteValue = bruteValue;
    }

    public double getBruteValue() {
        return bruteValue;
    }
    public void setBruteValue(double bruteValue) {
        this.bruteValue = bruteValue;
    }

    public double convertScale() {
        return bruteValue = (bruteValue/ 1023.0) * 100;
    }
}

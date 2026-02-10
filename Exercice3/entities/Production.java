package entities;

public class Production {
    private Integer productionValue;

    public Production(Integer productionValue) {
        this.productionValue = productionValue;
    }

    public Integer getProductionValue() {
        return productionValue;
    }
    public void setProductionValue(Integer productionValue) {
        this.productionValue = productionValue;
    }

    public int sumOfProduction(int sum) {
        return sum += productionValue;
    }

    public Double averageOfProduction(int sum, double average) {
        return average = sum / 5;
    }
}

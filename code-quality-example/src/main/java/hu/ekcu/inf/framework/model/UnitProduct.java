package hu.ekcu.inf.framework.model;

public class UnitProduct extends Product {

    private final double cost;

    public UnitProduct(String name, String id, double cost) {
        super(name, id);
        if (cost <= 0.0) {
            throw new IllegalArgumentException("Cost must be positive");
        }
        this.cost = cost;
    }

    @Override
    public double cost() {
        return cost;
    }
}

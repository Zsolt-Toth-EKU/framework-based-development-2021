package hu.ekcu.inf.framework.model;

import java.util.Collection;
import java.util.HashSet;

public class ShoppingCart implements Payable {

    private Collection<Product> items;

    public ShoppingCart() {
        this.items = new HashSet<>();
    }

    void addProduct(Product product) {
        this.items.add(product);
    }

    @Override
    public double cost() {
        return items.stream().map(Product::cost).reduce(0.0, Double::sum);
    }
}

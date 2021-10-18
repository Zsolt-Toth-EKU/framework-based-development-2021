package hu.ekcu.inf.framework.model;

import lombok.Getter;

@Getter
public abstract class Product implements Payable {

    private final String name;

    private final String id;

    public Product(String name, String id) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("Product Name cannot be empty");
        }
        this.name = name;
        this.id = id;
    }

    public abstract double cost();

}

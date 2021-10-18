package hu.ekcu.inf.framework.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Discount implements Payable {

    private final Payable payable;

    @Getter
    private final double percentage = 10.0;

    @Override
    public double cost() {
        return ((100.0 - percentage)/100.0) * payable.cost();
    }
}

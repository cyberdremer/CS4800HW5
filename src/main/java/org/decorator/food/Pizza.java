package org.decorator.food;

public class Pizza extends BaseItem{
    public Pizza(double cost) {
        super(cost);
    }

    @Override
    public String getName() {
        return Pizza.class.getSimpleName();
    }
}

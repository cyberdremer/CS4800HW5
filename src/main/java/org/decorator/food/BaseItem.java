package org.decorator.food;

public abstract class BaseItem implements FoodItem{
    protected double cost;
    BaseItem(double cost){
        this.cost = cost;

    }

    @Override
    public double getCost() {
        return this.cost;
    }
}

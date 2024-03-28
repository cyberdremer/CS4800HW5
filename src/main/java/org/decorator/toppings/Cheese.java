package org.decorator.toppings;

import org.decorator.food.FoodItem;

public class Cheese extends ToppingDecorator {


    public Cheese(FoodItem item){
        super(item);
        this.cost = 3.00;
        this.name = Cheese.class.getSimpleName();

    }
    @Override
    public double getCost() {
        return this.item.getCost() + this.cost;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

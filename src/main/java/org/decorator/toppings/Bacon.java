package org.decorator.toppings;

import org.decorator.food.FoodItem;

public class Bacon extends ToppingDecorator {



    public Bacon(FoodItem item){
        super(item);
        this.cost = 5.00;
        this.name = Bacon.class.getSimpleName();

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

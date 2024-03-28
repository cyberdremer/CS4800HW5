package org.decorator.toppings;

import org.decorator.food.FoodItem;

public abstract class ToppingDecorator implements FoodItem {
    protected double cost;
    protected FoodItem item;
    protected String name;
    ToppingDecorator(FoodItem item){
        this.item = item;
    }
}

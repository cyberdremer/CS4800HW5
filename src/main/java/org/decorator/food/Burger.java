package org.decorator.food;

public class Burger extends BaseItem{

    public Burger(double cost){
        super(cost);

    }

    @Override
    public String getName() {
        return Burger.class.getSimpleName();
    }
}

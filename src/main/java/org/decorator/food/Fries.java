package org.decorator.food;

public class Fries extends BaseItem{

    public Fries(double cost){
        super(cost);
    }
    @Override
    public String getName() {
        return Fries.class.getSimpleName();
    }
}

package org.decorator;

import org.decorator.food.FoodItem;

import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> foodItemArrayList;

    public Order(){
        foodItemArrayList = new ArrayList<>();
    }

    public void addItem(FoodItem item){
        foodItemArrayList.add(item);
    }

    public double getOrderTotal(){
        double orderTotal = 0.0;
        for(FoodItem item: this.foodItemArrayList){
            orderTotal += item.getCost();

        }
        return orderTotal;

    }
}

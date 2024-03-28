package org.decorator;

import org.decorator.food.Burger;
import org.decorator.food.FoodItem;
import org.decorator.food.Fries;
import org.decorator.food.Pizza;
import org.decorator.toppings.Bacon;
import org.decorator.toppings.Cheese;
import org.decorator.toppings.Loyalty;

import java.text.DecimalFormat;

public class Driver {
    private static final DecimalFormat decimalFormater = new DecimalFormat("0.00");
    public static void main(String[] args){
        burgerWithToppings();
        friesWithTopping();
        pizzaWithNoTopping();


    }

    public static void burgerWithToppings(){
        FoodItem burger = new Burger(5);
        System.out.println("Adding bacon and cheese to " + burger.getName());
        burger = new Cheese(burger);
        burger = new Bacon(burger);



        Order order = new Order();
        order.addItem(burger);
        System.out.println("Calculating order total with max toppings and no discount. ");
        double total = Loyalty.applyDiscount(order, Loyalty.LoyaltyStatus.NORMAL);
        System.out.println("$" + decimalFormater.format(total));

    }

    public static void friesWithTopping(){
        FoodItem fries = new Fries(3);
        System.out.println("Adding cheese to " + fries.getName());
        fries = new Cheese(fries);


        Order order = new Order();
        order.addItem(fries);
        System.out.println("Calculating cost for the toppings with gold status");
        double total = Loyalty.applyDiscount(order, Loyalty.LoyaltyStatus.GOLD);
        System.out.println("$" + decimalFormater.format(total));

    }

    public static void pizzaWithNoTopping(){
        FoodItem pizza = new Pizza(14.88);
        System.out.println("Adding absolutely nothing to " + pizza.getName());

        Order order = new Order();
        order.addItem(pizza);
        System.out.println("Calculating cost for the pizza with no toppings and a diamond status");
        double total = Loyalty.applyDiscount(order, Loyalty.LoyaltyStatus.DIAMOND);
        System.out.println("$" + decimalFormater.format(total));

    }
}

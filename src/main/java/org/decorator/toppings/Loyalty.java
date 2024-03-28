package org.decorator.toppings;

import org.decorator.Order;

import java.util.HashMap;
import java.util.Hashtable;

public class Loyalty {
    public enum LoyaltyStatus {
        NORMAL, GOLD, DIAMOND
    }
    private static Hashtable<LoyaltyStatus, Double>  loyaltyStatusDiscount = new Hashtable<>();
    static {
        loyaltyStatusDiscount.put(LoyaltyStatus.NORMAL, 0.0);
        loyaltyStatusDiscount.put(LoyaltyStatus.GOLD, 0.1);
        loyaltyStatusDiscount.put(LoyaltyStatus.DIAMOND, 0.2);
    }
    public static double applyDiscount(Order order, LoyaltyStatus loyaltyStatus){
        double discount = loyaltyStatusDiscount.get(loyaltyStatus);
        return order.getOrderTotal() * (1 - discount);


    }
}

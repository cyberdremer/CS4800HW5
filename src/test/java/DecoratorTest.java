import org.decorator.Order;
import org.decorator.food.Pizza;
import org.decorator.toppings.Bacon;
import org.decorator.food.Burger;

import org.decorator.food.FoodItem;
import org.decorator.toppings.Cheese;
import org.decorator.toppings.Loyalty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    public void testFoodItemName(){
        FoodItem burger = new Burger(0);
        String expectedName = "Burger";
        assertEquals(expectedName, burger.getName());
    }


    @Test
    public void testToppingName(){
        FoodItem burger = new Burger(0);
        burger = new Cheese(burger);
        String expectedName = "Cheese";
        assertEquals(expectedName, burger.getName());
    }

    @Test
    public void testFoodItem(){
        FoodItem burger = new Burger(5);
        double expectedCost = 5;
        assertEquals(expectedCost, burger.getCost());
    }

    @Test
    public void testTopping(){
        FoodItem burger = new Burger(5);
        burger = new Bacon(burger);

        double expectedCost = 10;
        assertEquals(expectedCost, burger.getCost());
    }

    @Test
    public void testEmptyOrder(){
        Order order = new Order();
        double expectedTotal = 0;
        assertEquals(order.getOrderTotal(), expectedTotal);
    }


    @Test
    public void testBaseOrder(){
        Order order = new Order();
        order.addItem(new Burger(5));
        double expectedTotal = 5;

        assertEquals(order.getOrderTotal(), expectedTotal);


    }



    @Test
    public void testCheeseTopping(){
        Order order = new Order();
        FoodItem burger = new Burger(5);
        burger = new Cheese(burger); //Price of cheese is $3
        order.addItem(burger);
        double expectedTotal = 8;

        assertEquals(expectedTotal, order.getOrderTotal());

    }

    @Test
    public void testBaconTopping(){
        Order order = new Order();
        FoodItem pizza = new Pizza(10);
        pizza = new Bacon(pizza); //Price of bacon is $5
        order.addItem(pizza);
        double expectedTotal = 15;

        assertEquals(expectedTotal, order.getOrderTotal());
    }


    @Test
    public void testNoDiscount(){
        Order order = new Order();
        FoodItem Burger = new Burger(5);
        order.addItem(Burger);

        double expectedTotal = 5;
        assertEquals(expectedTotal, Loyalty.applyDiscount(order, Loyalty.LoyaltyStatus.NORMAL));

    }

    @Test
    public void testGoldDiscount(){
        Order order = new Order();
        FoodItem Burger = new Burger(5);
        order.addItem(Burger);

        double expectedTotal = 4.5;
        assertEquals(expectedTotal, Loyalty.applyDiscount(order, Loyalty.LoyaltyStatus.GOLD));

    }


    @Test
    public void testDiamondDiscount(){
        Order order = new Order();
        FoodItem Burger = new Burger(5);
        order.addItem(Burger);

        double expectedTotal = 4.0;
        assertEquals(expectedTotal, Loyalty.applyDiscount(order, Loyalty.LoyaltyStatus.DIAMOND));
    }



}

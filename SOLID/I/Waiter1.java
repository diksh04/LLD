package SOLID.I;

// BAD: This class violates ISP(clients shouldn't depend on unused interfaces)
// Bloated class with empty or error-throwing methods
// This Waiter is forced to implement methods it doesn't need
public class Waiter1 implements RestaurantEmployee1 {
    
    @Override 
    public void takeOrder(){
        System.out.println("taking order...");
    }

    @Override 
    public void serveFoodAndDrinks(){
        System.out.println("serving food and drinks...");
    }

    @Override 
    public void cleanTheKitchen(){
        // Forced to implement but doesn't make sense for a waiter
        throw new AssertionError("Detail Message: Waiter cannot clean the kitchen!");
    }

    @Override 
    public void prepareFood(){
        // Forced to implement but doesn't make sense for a waiter
        throw new AssertionError("Detail Message: Waiter cannot prepare food!");
    }

    @Override 
    public void decideMenu(){
        // Forced to implement but doesn't make sense for a waiter
        throw new AssertionError("Detail Message: Waiter cannot decide Menu!");
    }

}

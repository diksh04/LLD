package SOLID.I;

public class Demo1 {
    public static void main(String[] args) {
        Waiter1 waiter1 = new Waiter1();
        // works fine
        waiter1.takeOrder();
        waiter1.serveFoodAndDrinks();

        //these will throw exceptions

        waiter1.decideMenu();
        waiter1.prepareFood();
        waiter1.cleanTheKitchen();
    }
    
}


/*
Problems with the Above Code
    Classes are forced to implement methods they don't support.
    Results in AssertionError being thrown.
    Code becomes bloated with empty or error-throwing methods.
    Violates the principle that clients shouldn't depend on unused interfaces.

*/
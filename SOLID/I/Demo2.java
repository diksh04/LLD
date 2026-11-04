package SOLID.I;

// Usage example - Following ISP
public class Demo2 {
    public static void main(String[] args) {
        // Now classes only implement what they actually support
        Chef chef = new Chef();
        chef.decideMenu();
        chef.prepareFood();

        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();
    }
}

/*  Benifits
Prevents bloated classes by having each class implement interfaces that it uses.
No forced dependencies on irrelevant functionality.
Cleaner, more maintainable design/code.
Different Restaurant Employee entities can implement multiple interfaces only when they support those features.


Summary
The Interface Segregation Principle (ISP) helps maintain focused classes by ensuring
they only implement the methods they need. 
To identify potential violations of the ISP, look for indicators such as low cohesion, large or
“fat” interfaces, empty methods, and challenging testing scenarios. By recognizing these signs early, you can
refactor your code to uphold a modular and flexible design.

 */
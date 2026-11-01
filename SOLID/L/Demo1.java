package SOLID.L;

public class Demo1 {
    public static void main(String[] args) {
        Motorcycle1 motorcycle1 = new Motorcycle1("HeroHonda",10);
        Cycle1 cycle1 = new Cycle1("Hercules",true,10);

        // Works fine with MotorCycle - implements all Bike class behavior
        motorcycle1.turnOnEngine();
        motorcycle1.accelerate();
        motorcycle1.applyBrakes();
        motorcycle1.turnOffEngine();

        cycle1.turnOnEngine(); // fails to implement bike class
        cycle1.accelerate();
        cycle1.applyBrakes();
        cycle1.turnOffEngine(); // fails to implement bike class
    }
}

// Problems with the Above Code
// Not all bikes have engines(eBikes and Bicycles), but the base class forces the turnOnEngine() method.
// Bicycle throws an exception, violating the expected contract.
// Client code cannot safely treat all Bike subclasses uniformly.
package SOLID.L;

// This class violates LSP!
public class Cycle1 implements Bike1{
    String brand;
    Boolean hasGears;
    int speed;

    Cycle1(String brand,Boolean hasGears,int speed){
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }
    // LSP Violation: Strengthening preconditions
    // Bicycle changes the behavior of turnOnEngine

    @Override 
    public void turnOnEngine(){
        throw new AssertionError("Detail Message: Bike has no engine");
    }

    // Bicycle changes the behavior of turnOffEngine
    @Override 
    public void turnOffEngine(){
        throw new AssertionError("Detail Message: Bike has no engine");
    }

    @Override 
    public void accelerate(){
        this.speed = this.speed + 10;
        System.out.println("cycle speed: " + this.speed);
    }

    @Override 
    public void applyBrakes(){
        this.speed = this.speed - 10;
        System.out.println("cycle speed: " + this.speed);
    }

}

package SOLID.L;

public class Cycle2 extends Bike2 {
    String brand;
    boolean hasGears;
    int speed;

    Cycle2(String brand,Boolean hasGears,int speed){
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override 
    public void accelerate(){
        this.speed = this.speed + 10;
        System.out.println("cycle speed: " + this.speed);
    }

    @Override 
    public void applyBrakes(){
        this.speed = this.speed - 5;
        System.out.println("cycle speed: " + this.speed);
    }
}

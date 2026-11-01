package SOLID.L;


// Subclass of Bike - implements all Bike class behavior
public class Motorcycle2 extends Bike2 implements Engine {
    
    String company;
    boolean isEngineOn;
    int speed;

    Motorcycle2(String company, int speed){
        this.company = company;
        this.speed = speed;
    }

    @Override 
    public void turnOnEngine(){
        this.isEngineOn = true; // turn on the engine!
        System.out.println("Engine is ON.....");
    }

    @Override 
    public void turnOffEngine(){
        this.isEngineOn = false; // turn off the engine!
        System.out.println("Engine is OFF....");
    }

    @Override 
    public void accelerate(){
        this.speed = this.speed + 10;
        System.out.println("Motorcycle speed: " + this.speed);
    }

    @Override 
    public void applyBrakes(){
        this.speed = this.speed - 5;
        System.out.println("Motorcycle speed: " + this.speed);
    }

}

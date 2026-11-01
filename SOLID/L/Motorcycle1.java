package SOLID.L;

// Subclass of Bike - implements all Bike class behavior
public class Motorcycle1 implements Bike1 {
    
    String company;
    boolean isEngineOn;
    int speed;

    public Motorcycle1(String company,int speed){
        this.company = company;
        this.speed = speed;
    }

    @Override 
    public void turnOnEngine(){
        this.isEngineOn = true;
        System.out.println("Engine is ON.....");
    }

    @Override 
    public void turnOffEngine(){
        this.isEngineOn = false;
        System.out.println("Engine is OFF.....");
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

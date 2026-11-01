package SOLID.L;

// BAD: This design violates LSP
public interface Bike1 {

    void turnOnEngine();
    
    void turnOffEngine();

    void accelerate();

    void applyBrakes();
} 

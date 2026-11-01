package SOLID.L;

public class Demo2 {
    public static void main(String[] args) {
        Motorcycle2 motorcycle2 = new Motorcycle2("HeroHonda",10);
        Cycle2 cycle2 = new Cycle2("Hercules",true,10);

        motorcycle2.turnOnEngine();
        motorcycle2.accelerate();
        motorcycle2.applyBrakes();
        motorcycle2.turnOffEngine();

        cycle2.accelerate();
        cycle2.applyBrakes();
    }
}

// Key Benefits of the Refactored Code
// Prevents Fragile Code: LSP helps avoid situations where subclass behavior violates the expectations set by the
// parent class.
// Improves Flexibility: By designing classes that can be substituted without breaking the parent contract.
// Improved maintainability: Changes to subclasses don't break existing code.
// Promotes Code Reusability: LSP facilitates the reuse of base classes and the creation of new subclasses
// without requiring modifications to existing code.

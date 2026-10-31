package SOLID.O;

// Responsibility: Managing Database Operations and File Operations
// BAD: This class violates OCP - needs modification for every new
// kind of save function
public class InvoiceDao1 {
    Invoice invoice;
    public InvoiceDao1(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }
    // BAD: This design violates OCP
    // Every time we add a new save function, we need to modify the existing InvoiceDao1 class

    public void saveToFile(){
        // Save into the file 
        System.out.println("Saving to file.....");
    }
}

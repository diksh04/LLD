package SOLID.O;

// Responsibility: Managing Database Operations only
public class InvoiceDao01d {
    Invoice invoice;

    public  InvoiceDao01d(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }
    
}
package SOLID.O;

// Concrete implementation for DatabaseInvoiceDao
public class DatabaseInvoiceDao implements InvoiceDao2 {
    Invoice invoice;

    public DatabaseInvoiceDao(Invoice invoice){
        // set the invoice
        this.invoice = invoice;
    }
    @Override 
    public void save(){
        // save into the DB the invoice
        System.out.println("saving to DB via InvoiceDao2 interface....");
    }
}

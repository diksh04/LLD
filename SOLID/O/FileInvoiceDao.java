package SOLID.O;

// Concrete implementation for FileInvoiceDao
// NEW File Save Operation: An extension without modification!
public class FileInvoiceDao implements InvoiceDao2 {
    Invoice invoice;

    public FileInvoiceDao(Invoice invoice){
        // set the invoice
        this.invoice = invoice;
    }

    @Override 
    public void save(){
        // save into the file the invoice
        System.out.println("saving to file via InvoiceDao2 interface.....");
    }

}

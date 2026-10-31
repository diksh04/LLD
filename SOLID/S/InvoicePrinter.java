package SOLID.S;

// Responsibility 3: Printing the Invoice only
public class InvoicePrinter {
    private Invoice2 invoice2;

    public InvoicePrinter(Invoice2 invoice){
        this.invoice2 = invoice;
    }

    public void print(){
        // printing the invoice
        System.out.println("Printing invoice 2.....");
    }

}

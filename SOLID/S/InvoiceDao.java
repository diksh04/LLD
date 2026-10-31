package SOLID.S;
// Responsibility 2: Managing Database Operations only
public class InvoiceDao {
    private Invoice2 invoice2;
    
    public InvoiceDao(Invoice2 invoice){
        this.invoice2 = invoice;
    }
    
    public void saveToDB(){
        //save the invoice to DB
        System.out.println("saving invoice to DB invoice 2.........");
    }
}

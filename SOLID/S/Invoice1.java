// BAD: This class violates SRP by having multiple responsibilities
package SOLID.S;
public class Invoice1 {
    private Marker1 marker1;
    private int quantity;
    private int total;

    public Invoice1(Marker1 marker1,int quantity){
        this.marker1 = marker1;
        this.quantity = quantity;
    }

    // Responsibility 1: Calculate the total(business logic)
    public void calculateTotal(){
        System.out.println("calculating total.....");
        this.total = this.quantity * this.marker1.price;
    }
    // Responsibility 2: Database Operations
    public void saveToDB(){
        // save the data to DB
        System.out.println("saving to DB.....");
    }

    // Responsiblity 3: Print the invoice
    public void printInvoice(){
        // print the Invoice
        System.out.println("Printing Invoice...");
    }

}

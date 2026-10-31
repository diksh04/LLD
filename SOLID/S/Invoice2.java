package SOLID.S;
// GOOD: Following SRP - Each class has a single responsibility

// Responsibility: Managing Invoice data only

public class Invoice2 {
    private Marker2 marker2;
    int quantity;
    int total;

    public Invoice2(Marker2 marker,int quantity){
        this.marker2 = marker;
        this.quantity = quantity;
    }
    // Responsibility 1: Calculate the total(business logic)
    public void calculateTotal(){
        this.total = this.quantity * marker2.price;
    }

}

package SOLID.O;

public class Invoice {
    Marker marker;
    int quantity;
    int total;

    Invoice(Marker marker,int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
     public void calculateTotal(){
        System.out.println("calculating total.....");
        this.total = this.quantity * this.marker.price;
    }
}

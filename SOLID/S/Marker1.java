package SOLID.S;
// voilates SRP
public class Marker1{ 
    String name;
    String color;
    int price;
    int year;

    public Marker1(String name,String color,int price,int year){
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}

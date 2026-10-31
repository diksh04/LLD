package SOLID.S;
// voilates SRP
public class Demo1 {
    public static void main(String[] args){
        System.out.println("---This code voilates SRP---");
        Invoice1 invoice1 = new Invoice1(new Marker1("trimex","blue", 10,2020),10);
        invoice1.calculateTotal();
        invoice1.saveToDB();
        invoice1.printInvoice();
    }
}

//Problems with the Above Code
// The Invoice class has 3 different responsibilities
// 1. calculateTotal() → Responsibility 1: Calculate the total(business logic)
// 2. saveToDB() → Responsibility 2: Database Operations
// 3. printInvoice() → Responsibility 3: Print the Invoice
//This violates SRP because:
// If the tax calculation rules change, we need to modify the Invoice class.
// If the database structure changes, we need to modify the Invoice class.
// If the printing requirement changes, we need to modify the Invoice class.

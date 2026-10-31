package SOLID.O;

// Usage example - showing the problem
public class Demo1 {
    public void main(String[] args){
        Invoice invoice = new Invoice(new Marker("trimex", "blue", 10, 2020),10);
        invoice.calculateTotal();

        InvoiceDao1 databaseFileSave = new InvoiceDao1(invoice);
        databaseFileSave.saveToDB();
        databaseFileSave.saveToFile();
    }
}

/* Problem: If we want to add a new function like saveToMongoDB(),
 we need to modify InvoiceDao and all its derived classes(ifexists)
 This violates the "closed for modification" part of OCP

Problems with the Above Code
Modification Required: Every time we add a new type of save functionality(let’s say saveToMongoDB() ),
we must modify the existing InvoiceDao class.
Risk of Breaking Existing Code: Changes might introduce bugs in working functionality, i.e., the
InvoiceDao class that is already deployed in the production environment.
Testing Issues: Need to retest all existing functionality when adding new save operations.

*/
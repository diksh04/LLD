package SOLID.O;

// Usage demonstrating OCP compliance
public class Demo2 {
    public static void main(String[] args){
        Invoice invoice = new Invoice(new Marker("trimex","blue",10,2020),10);
        invoice.calculateTotal();
        InvoiceDao2 databaseInvoiceDao = new DatabaseInvoiceDao(invoice);
        InvoiceDao2 fileInvoiceDao = new FileInvoiceDao(invoice);

        databaseInvoiceDao.save();
        fileInvoiceDao.save();
    }
}
/*
Key Benefits of the Refactored Code
Reduced risk: Existing tested code remains unchanged.
Better maintainability: New features don't break existing functionality.
Improved flexibility: Easy to add new behaviors without touching existing code.
Enhanced testability: New extensions can be tested independently.
Supports polymorphism: Enables dynamic behavior through interfaces and inheritance.

Summary
By adhering to the Open/Closed Principle (OCP), developers can construct software architectures that are both
adaptable and resilient, allowing them to evolve and expand without compromising existing functionalities.

This principle emphasizes the importance of abstraction and the creation of well-defined interfaces,
which not only accommodate current requirements but also anticipate future enhancements.

Systems designed with OCP in mind enhance robustness and maintainability, increase the longevity and scalability
of software solutions, and reduce the risk of introducing defects during changes.

*/
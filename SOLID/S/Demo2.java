package SOLID.S;

// Usage example showing how all classes work together
public class Demo2 {
    public static void main(String[] args){
        // create the service objects
        Invoice2 invoice2 = new Invoice2(new Marker2("trimex","blue",10,2020),10);

        InvoiceDao invoiceDao = new InvoiceDao(invoice2);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice2);

        // Use the services
        invoice2.calculateTotal();
        invoiceDao.saveToDB();
        invoicePrinter.print();
    }
}

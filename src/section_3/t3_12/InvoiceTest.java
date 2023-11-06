package section_3.t3_12;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("12341212", "Hat", 3, 20.00);

        invoice.setQuantity(-2);

        System.out.println(invoice);

        System.out.println(invoice.getInvoiceAmount());

    }
}

public class OrderService {
    MessageClient mc;
    Tax tax;

    OrderService(MessageClient mc, Tax tax) {
        this.tax = tax;
        this.mc = mc;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = tax.totalWithTax(subtotal);
        mc.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}
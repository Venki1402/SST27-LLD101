public class Tax {
    double taxRate = 0.18;

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}

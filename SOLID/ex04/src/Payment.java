public class Payment {
    PaymentType provider;
    double amount;

    Payment(PaymentType p, double a) {
        provider = p;
        amount = a;
    }
}
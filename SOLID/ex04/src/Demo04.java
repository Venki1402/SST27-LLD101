
public class Demo04 {
    public static void main(String[] args) {
        // System.out.println(new PaymentService().pay(new Payment("UPI", 499)));
        PaymentService ps = new UpiPaymentService();
        Payment p = new Payment(PaymentType.UPI, 499);
        System.out.println(ps.pay(p));
    }
}

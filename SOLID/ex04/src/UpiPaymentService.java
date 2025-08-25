public class UpiPaymentService implements PaymentService {

    @Override
    public String pay(Payment p) {
        // TODO Auto-generated method stub
        return "Paid via UPI: " + p.amount;
    }

}

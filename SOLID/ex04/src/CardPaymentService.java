public class CardPaymentService implements PaymentService {

    @Override
    public String pay(Payment p) {
        // TODO Auto-generated method stub
        return "Charged card: " + p.amount;
    }

}

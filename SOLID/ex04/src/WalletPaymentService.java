public class WalletPaymentService implements PaymentService {

    @Override
    public String pay(Payment p) {
        // TODO Auto-generated method stub
        return "Wallet debit: " + p.amount;
    }

}

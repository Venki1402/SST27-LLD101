
public class Demo01 {
    public static void main(String[] args) {
        MessageClient mc = new EmailClient();
        Tax tx = new Tax();
        OrderService os = new OrderService(mc, tx);
        os.checkout("a@shop.com", 100.0);
    }
}

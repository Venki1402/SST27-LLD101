public class Demo09 {
    public static void main(String[] args) {
        SqlOrderRepository sqlOrderRepository = new SqlOrderRepository();
        OrderController orderController = new OrderController(sqlOrderRepository);
        orderController.create("ORD-1");
        // new OrderController().create("ORD-1");
    }
}

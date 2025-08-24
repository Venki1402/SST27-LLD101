public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator scc = new ExpressShippingCostCalculator();
        Shipment s = new Shipment(ShipmentType.EXPRESS, 2.0);
        System.out.println(scc.cost(s));
    }
}

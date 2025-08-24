public class StandardShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double cost(Shipment s) {
        // TODO Auto-generated method stub
        return 50 + 5 * s.weightKg;
    }

}

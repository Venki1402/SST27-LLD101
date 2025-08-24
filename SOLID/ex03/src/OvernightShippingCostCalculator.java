public class OvernightShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double cost(Shipment s) {
        // TODO Auto-generated method stub
        return 120 + 10 * s.weightKg;
    }

}

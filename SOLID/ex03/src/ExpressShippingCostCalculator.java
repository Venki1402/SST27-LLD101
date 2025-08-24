public class ExpressShippingCostCalculator implements ShippingCostCalculator {

    @Override
    public double cost(Shipment s) {
        // TODO Auto-generated method stub
        return 80 + 8 * s.weightKg;
    }

}

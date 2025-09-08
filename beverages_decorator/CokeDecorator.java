package beverages_decorator;

public class CokeDecorator extends Beverage {
    Beverage beverage;

    CokeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 40;
    }

}

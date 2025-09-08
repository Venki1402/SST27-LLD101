package beverages_decorator;

public class Latte extends Beverage {
	Beverage beverage;

	Latte(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return beverage.cost() + 20;
	}
}

public class OriginalPizza extends PizzaOrTopping {

	private double cost;
	private long cookingTime;

	public OriginalPizza(int orderNum) {
		super(orderNum);
		description = "Original Pizza\n";
		cost = 3.75;
		cookingTime = 10000;

	}

	@Override
	public long getCookingTime() {

		return cookingTime;
	}

	@Override
	public double cost() {

		return cost;
	}
}

public class Cheese extends Topping {
	
	private PizzaOrTopping pizzaOrTopping;
	private double cost;
	private int cookingTime;

	public Cheese(PizzaOrTopping pizzaOrTopping) {
		super(pizzaOrTopping.getOrderNum());

		this.pizzaOrTopping = pizzaOrTopping;
		cost = 0.75;
		cookingTime = 2000;
	}

	@Override
	public String getDescription() {

		return pizzaOrTopping.getDescription()+toString();
	}

	@Override
	public long getCookingTime() {

		return  pizzaOrTopping.getCookingTime()+cookingTime;
	}

	@Override
	public double cost() {

		return pizzaOrTopping.cost()+cost;
	}

	@Override
	public String toString() {
	
		return "\tCheese Topping\n";
	}
}

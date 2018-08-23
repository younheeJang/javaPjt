
public class Order implements Observer {

	private int orderNum;
	private boolean collected;
	private Subject pizzaOven;
	
	public Order(int orderNumber, Oven pizzaOven) {
	this.orderNum= orderNumber;
	this.pizzaOven = pizzaOven;
	collected = false;	
	}
	
	@Override
	public void update(PizzaOrTopping pizza) {
		if(this.orderNum == pizza.getOrderNum()) {
			collected = true;
			pizzaOven=null;
		}
		
	}
	
}

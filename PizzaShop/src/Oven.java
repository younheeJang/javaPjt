import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Oven implements Subject {

	private PizzaOrTopping finishedPizza;
	private ArrayList<PizzaOrTopping> pizzas;
	private ArrayList<Observer> observers;

	public Oven() {
		pizzas = new ArrayList<PizzaOrTopping>();
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);

	};

	public void removeObserver(Observer o) {
		observers.remove(o);
	};

	public void notifyObservers() {

		for (Observer observer : observers) {
			observer.update(finishedPizza);

		}
	};

	void addPizza(PizzaOrTopping pizza) {
		pizzas.add(pizza);
		Timer pizzaTimer = new Timer();
		pizzaTimer.schedule(new TimerTask() {

			public void run() {
				pizza.finish();
				finishedPizza = pizza;
				removePizza(pizza);
				notifyObservers();
			}
		}, pizza.getCookingTime());

	}

	void removePizza(PizzaOrTopping pizza) {
		int i = observers.indexOf(pizza);
		if (i >= 0) {
			observers.remove(i);
		}

	}

	public String toString() {

		String res = "";
		for (PizzaOrTopping res1 : pizzas) {
			res += res1.getDescription();
		}
		return res;
	}

}

public abstract class PizzaOrTopping {

	protected String description;
	private boolean isFinished;
	private int orderNum;
	public PizzaOrTopping(int orderNum) {
		isFinished= false;
		description= "Unknown Pizza";
	}

	public String getDescription() {
		return description;
	}

	public boolean getIsFinished() {
		return isFinished;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void finish() {
		isFinished = true;

	}

	@Override
	public String toString() {
	
		return super.toString();
	}

public abstract long getCookingTime() ;

public abstract double cost();


}

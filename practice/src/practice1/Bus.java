package practice1;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("Bus Runs");
	}

	public void checkFare() {
		System.out.println("check for fee");
	}
}

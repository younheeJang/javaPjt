package practice1;

public class DriverExample {
	public static void main(String[] args) {
		
		/*Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);*/
		
		Vehicle vehicle = new Bus();
		Vehicle vehicle1 = new Taxi();
		vehicle.run();
		vehicle1.run();
		
		Bus bus = (Bus) vehicle;
		Taxi taxi = (Taxi) vehicle1;
		
		bus.run();
		bus.checkFare();
		
		taxi.run();
		
		
		
	}
}

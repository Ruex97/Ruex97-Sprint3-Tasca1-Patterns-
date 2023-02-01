package ex1;

public class App {

	public static void main(String[] args) {
		Pilot pilot = new Pilot();
		
		Vehicle car = new Vehicle("car");
		Vehicle plane = new Vehicle("plane");
		Vehicle bike = new Vehicle("bike");
		Vehicle ship = new Vehicle("ship");
		
		pilot.takeCommand(new TurnOnVehicle(car)); 
		pilot.takeCommand(new TurnOnVehicle(plane)); 
		pilot.takeCommand(new TurnOnVehicle(bike)); 
		pilot.takeCommand(new TurnOnVehicle(ship)); 
		

		pilot.takeCommand(new AcceleratingVehicle(car));
		pilot.takeCommand(new AcceleratingVehicle(plane));
		pilot.takeCommand(new AcceleratingVehicle(bike));
		pilot.takeCommand(new AcceleratingVehicle(ship));
		
		pilot.takeCommand(new SlowingDownVehicle(car));
		pilot.takeCommand(new SlowingDownVehicle(plane));
		pilot.takeCommand(new SlowingDownVehicle(bike));
		pilot.takeCommand(new SlowingDownVehicle(ship));
	
		pilot.activateAllCommands();
		
		
		
		

	}

}

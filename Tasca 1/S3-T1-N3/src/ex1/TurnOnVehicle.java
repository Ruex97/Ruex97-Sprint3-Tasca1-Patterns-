package ex1;

public class TurnOnVehicle implements Command {
	
	private Vehicle myVehicle;
	
	public TurnOnVehicle(Vehicle myVehicle) {
		this.myVehicle = myVehicle;
	}
	
	@Override
	public void execute() {
		this.myVehicle.turnOn();
		
	}

}

package ex1;

public class AcceleratingVehicle implements Command{
	
	private Vehicle myVehicle;
	
	public AcceleratingVehicle(Vehicle myVehicle) {
		this.myVehicle = myVehicle;
	}
	
	@Override
	public void execute() {
		this.myVehicle.accelerating();
		
	}

}

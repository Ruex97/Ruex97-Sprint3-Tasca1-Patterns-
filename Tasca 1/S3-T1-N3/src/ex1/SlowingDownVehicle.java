package ex1;

public class SlowingDownVehicle implements Command {
	
	private Vehicle myVehicle;
	
	public SlowingDownVehicle(Vehicle myVehicle) {
		this.myVehicle = myVehicle;
	}
	
	@Override
	public void execute() {
		this.myVehicle.slowDown();
		
	}

}

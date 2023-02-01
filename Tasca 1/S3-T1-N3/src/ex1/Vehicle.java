package ex1;

public class Vehicle {
	
	private String name;
	private String element;
	
	public Vehicle(String name) {
		this.name = name;
		if (name.equalsIgnoreCase("plane")) {
			element = "air";
		} else if(name.equalsIgnoreCase("ship") ) {
			element = "sea";
		} else {
			element = "land";
		}
		
	}
	
	
	public void turnOn() {
		System.out.println(name + " is ready to go through " + element);
	}
	
	public void accelerating() {
		System.out.println(name + " is accelerating");
	}
	
	public void slowDown() {
		System.out.println(name + " is slowing down");
	}
	
	//Aixo seria Kitchen Lights
}

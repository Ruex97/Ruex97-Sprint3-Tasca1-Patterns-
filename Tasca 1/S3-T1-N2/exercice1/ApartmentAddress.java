package exercice1;

public class ApartmentAddress implements Address{
	protected String street;
	protected int number;
	protected int floor;
	protected int door;
	protected String type;
	
	public ApartmentAddress(String street, int number, int floor, int door) {
		this.street = street;
		this.number = number;
		this.floor = floor;
		this.door = door;
		this.type = "apartment";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	@Override
	public void fullAddress() {
		System.out.println("Our family is living in "+ type + " in " + street +" street n " + number + " floor " + floor + " door " + door);
		
	}
	
	

}

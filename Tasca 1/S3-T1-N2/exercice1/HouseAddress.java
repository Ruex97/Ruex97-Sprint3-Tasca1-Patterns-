package exercice1;

public class HouseAddress implements Address{
	
	protected String street;
	protected int number;
	protected String type; 
	
	public HouseAddress(String street, int number) {
		this.street = street;
		this.number = number;
		this.type = "house";
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

	@Override
	public void fullAddress() {
		System.out.println("Our family is living in a " + type + " in " + street +" street n " + number);
		
	}
	
	

}

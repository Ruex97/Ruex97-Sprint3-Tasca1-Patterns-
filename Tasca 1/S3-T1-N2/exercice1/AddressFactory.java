package exercice1;

import java.util.Scanner;

public class AddressFactory implements AbstractFactory{

	@Override
	public Address createAddress(String type) {
		Address myAddress = null;
		String street;
		int number, floor, door;
		switch(type.toLowerCase()) {
		case "house":
			street = typeString("Street: ");
			number = typeInt("Number: ");
			myAddress = new HouseAddress(street, number);
			break;
		case "apartment":
			street = typeString("Street: ");
			number = typeInt("Number: ");
			floor = typeInt("Floor: ");
			door = typeInt("Door: ");
			myAddress = new ApartmentAddress(street, number, floor, door);
			break;
		default:
			System.out.println("This contacts book can only store house or apartment address!");
			
		}
		
		return myAddress;
	}
	

	
	
	public String typeString(String str) {
		Scanner input = new Scanner(System.in);
		System.out.println(str);
		String sentence = input.nextLine();
		return sentence;
	}
	
	public int typeInt(String str) {
		Scanner input = new Scanner(System.in);
		System.out.println(str);
		int value = input.nextInt();
		return value;
	}




	@Override
	public PhoneNumber createPhoneNumber(String type) {
		return null;
	}

	
	

}

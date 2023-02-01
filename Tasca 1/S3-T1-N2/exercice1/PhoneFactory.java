package exercice1;

import java.util.Scanner;

public class PhoneFactory implements AbstractFactory{
	
	

	@Override
	public PhoneNumber createPhoneNumber(String type) {
		
		PhoneNumber myPhone = null;
		switch(type.toLowerCase()) {
		case "spanish":
			myPhone = new SpanishPhoneNumber(typeString("Type the phone_number"));
			break;
		case "mexican":
			myPhone = new MexicanPhoneNumber(typeString("Type the phone_number"));
			break;
		case "australian":
			myPhone = new AustralianPhoneNumber(typeString("Type the phone_number"));
			break;
		default:
			System.out.println("This contacts book can only store spanish, mexican or australian phone numbers!");
			
		}
		
		return myPhone;
		
	}
	
	public String typeString(String str) {
		Scanner input = new Scanner(System.in);
		System.out.println(str);
		String sentence = input.nextLine();
		return sentence;
	}

	@Override
	public Address createAddress(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}

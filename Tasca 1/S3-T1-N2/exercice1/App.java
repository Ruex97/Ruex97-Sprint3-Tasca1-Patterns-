package exercice1;

import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		
		AbstractFactory phoneFactory = FactoryCreator.getFactory("phone");
		PhoneNumber mySpanishPhone = phoneFactory.createPhoneNumber("spanish");
		PhoneNumber myAustralianPhone = phoneFactory.createPhoneNumber("Australian");
		PhoneNumber myMexicanPhone = phoneFactory.createPhoneNumber("Mexican");
		
		
		AbstractFactory addressFactory = FactoryCreator.getFactory("address");
		Address myAddress = addressFactory.createAddress("house");
		Address myAddress2 = addressFactory.createAddress("house");
		Address myAddress3 = addressFactory.createAddress("apartment");
		
		Contact John = new Contact(myAddress, mySpanishPhone);
		Contact Tina = new Contact(myAddress2, myAustralianPhone);
		Contact Marvin = new Contact(myAddress3, myMexicanPhone);
		
		ArrayList<Contact> contactsBook = new ArrayList<>();
		contactsBook.add(Marvin);
		contactsBook.add(John);
		contactsBook.add(Tina);

	}

}

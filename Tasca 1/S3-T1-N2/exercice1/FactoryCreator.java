package exercice1;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(String type) {
		
		AbstractFactory myFactory = null;
		
		if (type.equalsIgnoreCase("phone")) {
			
			myFactory = new PhoneFactory();
			
		} else if (type.equalsIgnoreCase("address")) {
			
			myFactory = new AddressFactory();
		}
		return myFactory;
	}

}

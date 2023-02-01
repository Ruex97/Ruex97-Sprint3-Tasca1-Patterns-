package exercice1;

public interface AbstractFactory {
	
	 Address createAddress(String type);
	 PhoneNumber createPhoneNumber(String type);

}

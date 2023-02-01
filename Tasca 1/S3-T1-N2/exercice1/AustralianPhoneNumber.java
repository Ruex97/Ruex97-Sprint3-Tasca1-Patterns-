package exercice1;

public class AustralianPhoneNumber implements PhoneNumber{
	
	protected String phoneNumber;
	
	public AustralianPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void checkPhone() {
		System.out.println("Your phoneNumber is " + phoneNumber);
	}

}

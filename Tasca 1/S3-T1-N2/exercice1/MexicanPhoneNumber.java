package exercice1;

public class MexicanPhoneNumber implements PhoneNumber{
	protected String phoneNumber;
	
	public MexicanPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void checkPhone() {
		System.out.println("Your phoneNumber is " + phoneNumber);
	}
	
	
	
}

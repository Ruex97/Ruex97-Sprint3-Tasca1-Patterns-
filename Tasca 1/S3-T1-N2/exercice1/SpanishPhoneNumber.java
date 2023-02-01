package exercice1;

public class SpanishPhoneNumber implements PhoneNumber {
	
	protected String phoneNumber;
	
	public SpanishPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void checkPhone() {
		System.out.println("Your phoneNumber is " + phoneNumber);
	}

}

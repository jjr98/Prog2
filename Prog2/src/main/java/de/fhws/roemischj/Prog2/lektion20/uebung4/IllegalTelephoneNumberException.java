package de.fhws.roemischj.Prog2.lektion20.uebung4;

public class IllegalTelephoneNumberException extends Exception {

	private static final long serialVersionUID = -7109202272079062107L;

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	public IllegalTelephoneNumberException() {
		super();
	}

	public IllegalTelephoneNumberException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}
	
	
}

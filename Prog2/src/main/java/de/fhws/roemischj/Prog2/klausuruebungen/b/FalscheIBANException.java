package de.fhws.roemischj.Prog2.klausuruebungen.b;

public class FalscheIBANException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 152550490895434926L;

	public FalscheIBANException() {
		super("FEHLER: Datei enthält ungültige IBAN"); 
	}
	
	public FalscheIBANException(String message) {
		super(message);
	}
}

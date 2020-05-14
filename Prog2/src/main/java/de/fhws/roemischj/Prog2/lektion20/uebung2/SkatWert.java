package de.fhws.roemischj.Prog2.lektion20.uebung2;

public enum SkatWert {
	BUBE("Bube"), ASS("Ass"), ZEHN("10"), KOENIG("König"), DAME("Dame"), NEUN("9"), ACHT("8"), SIEBEN("7");
	
	String value;
	
	private SkatWert(String value) {
		this.value = value;
	}
}

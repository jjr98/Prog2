package de.fhws.roemischj.Prog2.lektion20.uebung2;

public enum SkatFarbe {
	KREUZ("Kreuz"), PIK("Pik"), HERZ("Herz"), KARO("Karo");
	
	String value;
	
	private SkatFarbe(String value) {
		this.value = value;
	}
}

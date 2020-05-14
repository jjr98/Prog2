package de.fhws.roemischj.Prog2.lektion20.uebung2;

public class SkatKarte implements Comparable<SkatKarte>{
	private SkatFarbe farbe;
	private SkatWert wert;
	
	public SkatKarte(SkatFarbe farbe, SkatWert wert) {
		this.setFarbe(farbe);
		this.setWert(wert);
	}

	public SkatFarbe getFarbe() {
		return farbe;
	}
	public SkatWert getWert() {
		return wert;
	}

	public void setFarbe(SkatFarbe farbe) {
		this.farbe = farbe;
	}
	public void setWert(SkatWert wert) {
		this.wert = wert;
	}

	
	@Override
	public int compareTo(SkatKarte k) {
		if(!this.farbe.equals(k.farbe))
			return this.farbe.compareTo(k.getFarbe());
		else if(!this.wert.equals(k.wert))
			return this.wert.compareTo(k.getWert());
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return farbe.value + " " + wert.value;
	}
	
}

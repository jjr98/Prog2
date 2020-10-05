package de.fhws.roemischj.Prog2.klausuruebungen.g;

public class MusikStueck {
	protected String titel; // Name des Musikstueckes
	protected String interpret; // Gruppe/Saenger des Stueckes
	protected int laenge; // Dauer in Sekunden

	public MusikStueck(String titel, String interpret, int laenge) {
		this.titel = titel;
		this.interpret = interpret;
		this.laenge = laenge;
	}
	
	@Override
	public String toString() {
		return "Titel: "+titel+"\n"
				+ "Interpret: " + interpret + "\n"
				+ "Länge: " + laenge + "\n";
	}
	
	public String getTitel() {
		return titel;
	}
// . . . alle getter‐ und setter‐Methoden sind vorhanden
}// endclass MusikStueck
package de.fhws.roemischj.Prog2.lektion14;

public class Adresse {
	String strasse;
	String hausnummer;
	int postleitzahl;
	String ort;
	
	public Adresse(String strasse, String hausnummer, int postleitzahl, String ort) {
		if(strasse.charAt(0)>= 'A' && strasse.charAt(0) <= 'Z')
			this.strasse = strasse;
		else
			throw new RuntimeException("Strasse muss mit Grossbuchstabe beginnen");
	
		if(hausnummer.charAt(0) >= '0' && hausnummer.charAt(0) <= '9')
			this.hausnummer = hausnummer;
		else
			throw new RuntimeException("Hausnummer muss mit Ziffer beginnen");
		
		this.postleitzahl = postleitzahl;
		
		if(ort.charAt(0)>= 'A' && ort.charAt(0) <= 'Z')
			this.ort = ort;
		else
			throw new RuntimeException("Ort muss mit Grossbuchstabe beginnen");
	}
}

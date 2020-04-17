package de.fhws.roemischj.Prog2.lektion14;

public class Person {
	String vorname;
	String nachname;
	Adresse adresse;
	
	public Person(String vorname, String nachname, String strasse, String hausnummer, int postleitzahl, String ort) {
		if(vorname.charAt(0)>= 'A' && vorname.charAt(0) <= 'Z') {
			this.vorname = vorname;
			this.nachname = nachname;
			this.adresse = new Adresse(strasse, hausnummer, postleitzahl, ort);
		}
		else {
			throw new RuntimeException("Vorname muss mit Grossbuchstabe beginnen");
		}
		
	}
}

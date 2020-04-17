package de.fhws.roemischj.Prog2.lektion15.uebung1;

import java.util.*;

public class Abteilungsleiter extends Angestellter{
	public Abteilungsleiter(String vorname, String nachname, double grundgehalt, Date geburtsdatum) {
		super(vorname, nachname, grundgehalt, geburtsdatum);
		this.gehaltsfaktor = 2;
	}
	
	protected void befoerdern(Angestellter angestellter) {
		angestellter.gehaltsfaktor *= 1.1; 
	}
}

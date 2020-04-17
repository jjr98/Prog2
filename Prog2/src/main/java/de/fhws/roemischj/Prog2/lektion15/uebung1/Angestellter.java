package de.fhws.roemischj.Prog2.lektion15.uebung1;

import java.util.*;

public class Angestellter {
	static int nextId= 1;
	
	String vorname;
	String nachname;
	int id;
	double grundgehalt;
	double gehaltsfaktor;
	Date geburtsdatum;
	
	public Angestellter(String vorname, String nachname, double grundgehalt, Date geburtsdatum) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.id = nextId;
		nextId++;
		this.grundgehalt = grundgehalt;
		this.gehaltsfaktor = 1;
		this.geburtsdatum = geburtsdatum;
	}
	
	public double berechneGehalt() {
		return gehaltsfaktor * grundgehalt;
	}
}

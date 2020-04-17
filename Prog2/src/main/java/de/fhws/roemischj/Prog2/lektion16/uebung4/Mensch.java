package de.fhws.roemischj.Prog2.lektion16.uebung4;

public class Mensch extends Fahrer{
	public Entscheidung entscheide(Gefahr g) {
		if(Math.random() < 0.75) {
			return super.entscheide(g);
		}
		else
			return Entscheidung.UNENTSCHIEDEN;
	}
}

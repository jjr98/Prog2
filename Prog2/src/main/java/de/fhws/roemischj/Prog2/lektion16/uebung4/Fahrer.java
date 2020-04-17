package de.fhws.roemischj.Prog2.lektion16.uebung4;

public abstract class Fahrer {
	public Entscheidung entscheide(Gefahr g) {
		switch (g) {
		case GEFAHR_LINKS:
			return Entscheidung.RECHTS;
		case GEFAHR_RECHTS:
			return Entscheidung.LINKS;
		default:
			return Entscheidung.BREMSEN;
		}
	}
}

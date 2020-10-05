package de.fhws.roemischj.Prog2.klausuruebungen.f;

import java.util.Comparator;

public class VergleichePersonalNummer implements Comparator<Mitarbeiter>{
	public int compare(Mitarbeiter m1, Mitarbeiter m2) {
		return Integer.compare(m1.getNummer(), m2.getNummer());
	}
}

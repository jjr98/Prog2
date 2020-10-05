package de.fhws.roemischj.Prog2.klausuruebungen.g;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck>{
	public int compare(MusikStueck m1, MusikStueck m2) {
		return m1.getTitel().compareTo(m2.getTitel());
	}
}

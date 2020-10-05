package de.fhws.roemischj.Prog2.klausuruebungen.g;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge implements Comparator<MusikStueck>{
	public int compare(MusikStueck m1, MusikStueck m2) {
//		return Integer.compare(m1.laenge, m2.laenge);
		if(m1.laenge == m2.laenge)	return 0;
		else if(m1.laenge > m2.laenge)	return 1;
		else return -1;
	}
}

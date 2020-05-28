package de.fhws.roemischj.Prog2.lektion22.uebung2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrimzahlMain {

	public static void main(String[] args) {
		PrimzahlThread t1 = new PrimzahlThread(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
		PrimzahlThread t2 = new PrimzahlThread(new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17,18,19,20)));
		PrimzahlThread t3 = new PrimzahlThread(new ArrayList<Integer>(Arrays.asList(341, 633910099)));
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Zusammenfuegen der Ergebnisse
		Map<Integer, Boolean> gesamtmap = new HashMap<>();
		gesamtmap.putAll(t1.ergebnis);
		gesamtmap.putAll(t2.ergebnis);
		gesamtmap.putAll(t3.ergebnis);
		
		gebeErgebnisAus(gesamtmap);
	}
	
	public static void gebeErgebnisAus(Map<Integer, Boolean> gesamtmap) {
		for(Integer zahl : gesamtmap.keySet()) {
			System.out.println(zahl + " -> " + gesamtmap.get(zahl));
		}
	}

}

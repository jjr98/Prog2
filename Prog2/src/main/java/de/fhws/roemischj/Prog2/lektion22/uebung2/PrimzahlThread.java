package de.fhws.roemischj.Prog2.lektion22.uebung2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlThread extends Thread {
	List<Integer> zahlenZumTesten = new ArrayList<>();
	Map<Integer, Boolean> ergebnis = new HashMap<>();
	
	public PrimzahlThread(ArrayList<Integer> zahlenZumTesten) {
		this.zahlenZumTesten = zahlenZumTesten;
	}
	public boolean testeObPrimzahl(int zahl) {
		if (zahl < 2) return false;
		for (int divisor = 2; divisor < zahl; divisor++)
			if (zahl% divisor == 0) return false;
		return true;
	}
	
	@Override
	public void run() {
		for (Integer zahl : zahlenZumTesten) {
			ergebnis.put(zahl, testeObPrimzahl(zahl));
		}
	}
}	
package de.fhws.roemischj.Prog2.klausuruebungen.g;

public class Main {
	public static void main(String[] args) {
		MusikStueck m1 = new MusikStueck("track1", "k1", 4875);
		MusikStueck m2 = new MusikStueck("jjhdfg", "k6", 856);
		MusikStueck m3 = new MusikStueck("öllrk", "k68", 7533);
		
		MusikStueckSammlung ms = new MusikStueckSammlung();
		ms.musikStueckEinfuegen(m1);
		ms.musikStueckEinfuegen(m2);
		ms.musikStueckEinfuegen(m3);
		
		for(MusikStueck m : ms.getAlleMusikStueckeNachTitel()) {
			System.out.println(m.toString());
		}
	}
}

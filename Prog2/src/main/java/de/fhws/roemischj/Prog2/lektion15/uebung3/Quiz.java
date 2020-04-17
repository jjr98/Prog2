package de.fhws.roemischj.Prog2.lektion15.uebung3;

public class Quiz {
	Quizfrage[] fragen;
	
	public Quiz(int anzahlFragen) {
		fragen = new Quizfrage[anzahlFragen];
	}
	public void generiereQuizbogen() {
		for (int i = 0; i < fragen.length; i++) {
			fragen[i].gibFrageAus();
			System.out.println();
		}
	}
	
	
	
	
	
}

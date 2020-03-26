package de.fhws.roemischj.Prog2.lektion2.uebung3;

public class Textfrage extends Quizfrage{

	public Textfrage(String textfrage) {
		this.frage = textfrage;
	}
	
	public void gibFrageAus() {
		System.out.println(frage + "\n\n");
	}
}

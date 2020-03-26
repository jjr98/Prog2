package de.fhws.roemischj.Prog2.lektion2.uebung3;

public class MultipleChoiceFrage extends Quizfrage{
	String[] antwortMoeglichkeiten;
	
	public MultipleChoiceFrage(String mcFrage, String... antwortMoeglichkeiten) {
		this.frage = mcFrage;
		this.antwortMoeglichkeiten = antwortMoeglichkeiten;
	}

	@Override
	public void gibFrageAus() {
		System.out.println("Fragentext: \n" + frage + "\n");
		System.out.println("Antwortmöglichkeiten:");
		for (int i = 0; i < antwortMoeglichkeiten.length; i++) {
			System.out.println((char)('A'+i) + ": " + antwortMoeglichkeiten[i]);
		}
	}

}

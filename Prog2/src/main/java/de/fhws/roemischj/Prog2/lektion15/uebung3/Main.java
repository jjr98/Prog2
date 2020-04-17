package de.fhws.roemischj.Prog2.lektion15.uebung3;

public class Main {

	public static void main(String[] args) {
		Quiz q = new Quiz(4);
		q.fragen[0] = new Textfrage("Wie heißt die Hauptstadt von Deutschland?");
		q.fragen[1] = new MultipleChoiceFrage("Wie viele Einwohner hat Deutschland?", "80,000,000", "12", "80,000,000,000");
		q.fragen[2] = new Textfrage("Wie heißt die deutsche Bundeskanzlerin?");
		q.fragen[3] = new MultipleChoiceFrage("Wie viele Bundesländer hat Deutschland?", "15", "16", "17", "18");
		
		q.generiereQuizbogen();
	}

}

package de.fhws.roemischj.Prog2.lektion20.uebung2;

import java.util.*;

public class Deck {
	private List<SkatKarte> deck = new ArrayList<>();
	int anzahlFarben = 4;
	int anzahlWerte = 8;
	
	public Deck() {
		instantiate(anzahlFarben, anzahlWerte);
	}
	
	public void instantiate(int anzahlFarben, int anzahlWerte) {
		for (int i = 0; i < anzahlFarben; i++) {
			for (int j = 0; j < anzahlWerte; j++) {
				SkatFarbe farbe = SkatFarbe.values()[i];
				SkatWert wert = SkatWert.values()[j];
				SkatKarte karte = new SkatKarte(farbe, wert);
				addCard(karte);
			}
		}
	}
	
	public void addCard(SkatKarte k) {
		if(!deck.contains(k))
			deck.add(k);
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public SkatKarte draw() {
		return deck.remove(0);
	}
}

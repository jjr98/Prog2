package de.fhws.roemischj.Prog2.lektion20.uebung2;

import java.util.*;

public class Spieler {
	private List<SkatKarte> hand = new ArrayList<>();
	
	public int getAnzahlKarten() {
		return hand.size();
	}
	
	public void drawCards(Deck deck, int anzahl) {
		while(hand.size() < anzahl) {
			SkatKarte k = deck.draw();
			if(!hand.contains(k))
				hand.add(k);
		}
	}
	
	public void sortiereHand() {
		Collections.sort(hand);
	}

	public void displayHand() {
		for(SkatKarte karte : hand) {
			System.out.println(karte);
		}
	}
}

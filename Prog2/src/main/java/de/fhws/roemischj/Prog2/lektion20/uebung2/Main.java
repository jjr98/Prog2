package de.fhws.roemischj.Prog2.lektion20.uebung2;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Spieler s = new Spieler();
		deck.shuffle();
		s.drawCards(deck, 10);
		s.sortiereHand();
		s.displayHand();
	}
}

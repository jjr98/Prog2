package de.fhws.roemischj.Prog2.klausuruebungen.c;

import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer>{
	private int nullCounter = 0;
	
	public boolean hasNext() {
		return (nullCounter<3);
	}
	
	public Integer next() {
		int rand = (int) (Math.random()*36);
		if(rand == 0) nullCounter++;
		return rand;
	}
}

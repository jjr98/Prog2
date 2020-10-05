package de.fhws.roemischj.Prog2.klausuruebungen.c;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer>
{
	@Override
	public Iterator<Integer> iterator()
	{
		return new RouletteZahlenIterator();
	}
	
	public static void main(String[] args) {
//		RouletteZahlen rz = new RouletteZahlen();
//		for(int zahl : rz) {
//			System.out.println(zahl);
//		}
////		for(Iterator i = rz.iterator();i.hasNext(); ) {
////			System.out.println(i.next());
////		}
		RouletteZahlenIterator rzi = new RouletteZahlenIterator();
		while(true) {
			if(!rzi.hasNext()) break;
			System.out.println(rzi.next());
		}
		
	}
}
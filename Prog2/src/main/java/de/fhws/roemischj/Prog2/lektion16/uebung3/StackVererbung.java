package de.fhws.roemischj.Prog2.lektion16.uebung3;

import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList<Object>
{
	public void push(Object o) {
		StackVererbung.this.add(o);
	}
	
	public Object pop() {
		int index = StackVererbung.this.size();
		Object ret = StackVererbung.this.get(index);
		StackVererbung.this.remove(index);
		return ret;
	}
}

// Nachteile der Vererbung: 
// Sichtbarkeit aller Methoden von ArrayList
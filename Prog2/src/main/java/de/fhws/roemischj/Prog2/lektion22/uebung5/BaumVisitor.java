package de.fhws.roemischj.Prog2.lektion22.uebung5;

import de.fhws.roemischj.Prog2.lektion22.uebung5.Baum.Knoten;

public class BaumVisitor<T> implements Visitor<T>{

	int numberOfVisits = 0;
	
	public int getNumberOfVisits() {
		return numberOfVisits;
	}

	@Override
	public void visit(Knoten<T> current) {
		numberOfVisits++;
	}

}

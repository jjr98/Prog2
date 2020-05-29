package de.fhws.roemischj.Prog2.lektion22.uebung5;

import de.fhws.roemischj.Prog2.lektion22.uebung5.Baum.Knoten;

public interface Visitor<T>
{
	public void visit(Knoten<T> current);
}

package de.fhws.roemischj.Prog2.lektion16.uebung4;

public class Cyborg extends Fahrer{
	Mensch m;
	Roboter r;
	
	public Entscheidung entscheide(Gefahr g) {
		Entscheidung me = m.entscheide(g);
		Entscheidung re = r.entscheide(g);
		if(me == re)
			return me;
		else
			return Math.random()>=0.5 ? me : re;
	}
}

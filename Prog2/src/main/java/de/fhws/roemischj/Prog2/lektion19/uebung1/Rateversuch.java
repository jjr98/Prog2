package de.fhws.roemischj.Prog2.lektion19.uebung1;

import java.io.Serializable;

public class Rateversuch implements Serializable{

	private static final long serialVersionUID = 4649545077539879345L;
	
	String versuch;
	
	public Rateversuch(String versuch) {
		super();
		this.versuch = versuch;
	}
}

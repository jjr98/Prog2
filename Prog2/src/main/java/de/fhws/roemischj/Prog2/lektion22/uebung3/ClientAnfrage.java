package de.fhws.roemischj.Prog2.lektion22.uebung3;

import java.io.Serializable;
import java.util.List;

public class ClientAnfrage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8892086835886853061L;
	List<Integer> zahlenZumTesten;

	public ClientAnfrage(List<Integer> zahlenZumTesten) {
		this.zahlenZumTesten = zahlenZumTesten;
	}
}

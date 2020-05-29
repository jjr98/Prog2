package de.fhws.roemischj.Prog2.lektion22.uebung3;

import java.io.Serializable;
import java.util.Map;

public class ServerAntwort implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8045110719127623333L;
	Map<Integer, Boolean> ergebnis;
	
	public ServerAntwort(Map<Integer, Boolean> ergebnis) {
		this.ergebnis = ergebnis;
	}
}

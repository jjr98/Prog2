package de.fhws.roemischj.Prog2.lektion19.uebung1;

import java.io.Serializable;

public class Antwort implements Serializable{

	private static final long serialVersionUID = 3617641233957576306L;
	
	String wort;
	String hinweis;
	boolean erraten;
	boolean beendet;
	boolean buchstabeIstRichtig;
	
	public Antwort(String wort, String hinweis, boolean erraten, boolean beendet, boolean buchstabeIstRichtig) {
		super();
		this.wort = wort;
		this.hinweis = hinweis;
		this.erraten = erraten;
		this.beendet = beendet;
		this.buchstabeIstRichtig = buchstabeIstRichtig;
	}
	
	
}

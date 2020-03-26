package de.fhws.roemischj.Prog2.lektion2.uebung2;

public class Main {
	public static void main(String[] args) {
		Person[] p = new Person[100];
		for (int i = 0; i < p.length; i++) {
			if(i%2 == 0)
				p[i] = new Student();
			else
				p[i] = new Professor();
		}
		
		for (int i = 0; i < p.length; i++) {
			p[i].gibTaetigkeitAus();
		}
	}
}

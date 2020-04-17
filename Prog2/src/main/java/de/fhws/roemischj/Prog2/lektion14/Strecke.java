package de.fhws.roemischj.Prog2.lektion14;

public class Strecke {
	int a;
	int b;
	
	public Strecke(int punkt1, int punkt2) {
		if(punkt1 < 0 || punkt2 < 0)
			throw new RuntimeException("Punkte muessen positiv sein");
		else if(punkt1 < punkt2) {
			this.a = punkt1;
			this.b = punkt2;
		}
		else {
			this.a = punkt2;
			this.b = punkt1;
		}
	}
	
	public static boolean pruefeUeberschneidung(Strecke s1, Strecke s2) {
		return !(s1.b <= s2.a || s1.a >= s2.b);
	}
	
	@Override 
	public String toString() {
		if(a == b)	
			return Integer.toString(a);	
		else {
			int distance = b-a;
			String s = "";
			s += a;
			for (int i = 0; i < distance; i++) {
				s += '-';
			}
			s += b;
			return s;
		}
	}
}

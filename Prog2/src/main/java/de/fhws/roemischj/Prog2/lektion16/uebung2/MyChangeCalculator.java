package de.fhws.roemischj.Prog2.lektion16.uebung2;

public class MyChangeCalculator implements ChangeCalculator{

	public int[] getChange(int euros, int cent) {
		int[] change = new int[8];
		int total = euros*100 + cent;
		for (int i = change.length - 1; i >= 0; i--) {
			if(total >= Coin.values()[i].value) {
				change[i] = total / Coin.values()[i].value;
				total = total % Coin.values()[i].value;
			}
		}
		return change;
//		int[] change = new int[8];
//		int rest;
//		change[7] = (int)(euros/2);
//		change[6] = euros%2;
//		change[5] = (int) (cent/50);
//		rest = cent%50;
//		change[4] = (int) (rest/20);
//		rest = rest%20;
//		change[3] = (int) (rest/10);
//		rest = rest%10;
//		change[2] = (int) (rest/5);
//		rest = rest%5;
//		change[1] = (int) (rest/2);
//		change[0] = rest%2;
//		return change;
	}

}

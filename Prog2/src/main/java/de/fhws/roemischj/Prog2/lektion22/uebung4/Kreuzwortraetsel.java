package de.fhws.roemischj.Prog2.lektion22.uebung4;

import java.util.Arrays;
import java.util.TreeSet;

public class Kreuzwortraetsel
{
	static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
			"Beige", "Barriere", "Bein", "Beil", "Christ", "Christian",	"Carmen"};

	public static void main(String[] args)
	{
		TreeSet<String> t1 = new TreeSet<>(new CustomComparator<String>());
		t1.addAll(Arrays.asList(alleWoerter));
		for (String wort : t1)
			System.out.println(wort);
	}
}
package de.fhws.roemischj.Prog2.lektion22.uebung4;

import java.util.Arrays;
import java.util.TreeSet;

public class KreuzwortraetselAnonym
{
	static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
			"Beige", "Barriere", "Bein", "Beil", "Christ", "Christian",	"Carmen"};

	public static void main(String[] args)
	{
		TreeSet<String> t1 = new TreeSet<>(new CustomComparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int length1 = o1.toString().length();
				int length2 = o2.toString().length();
				if(length1 < length2)
					return -1;
				if(length1 > length2)
					return 1;
				return o1.toString().compareTo(o2.toString());
			}
		});
		t1.addAll(Arrays.asList(alleWoerter));
		for (String wort : t1)
			System.out.println(wort);
	}
}

/* Vorteile:
 * 	keine zusätzliche Klasse nötig
 *  -> weniger Code
 * Nachteile:
 * 	unübersichtlicher
 * 	
 */

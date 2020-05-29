package de.fhws.roemischj.Prog2.lektion22.uebung4;

import java.util.Comparator;

public class CustomComparator<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		int length1 = o1.toString().length();
		int length2 = o2.toString().length();
		if(length1 < length2)
			return -1;
		if(length1 > length2)
			return 1;
		return o1.toString().compareTo(o2.toString());
	}

}

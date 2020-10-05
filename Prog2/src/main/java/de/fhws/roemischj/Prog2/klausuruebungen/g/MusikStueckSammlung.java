package de.fhws.roemischj.Prog2.klausuruebungen.g;

import java.util.Arrays;
import java.util.HashMap;

public class MusikStueckSammlung {
	HashMap<String, MusikStueck> map;

	public MusikStueckSammlung() {
		map = new HashMap<>();
	}

	void musikStueckEinfuegen(MusikStueck neu) throws IllegalArgumentException {
		if (map.containsValue(neu))
			throw new IllegalArgumentException("Musikstück schon vorhanden");
		map.put(neu.titel, neu);
	}

	public MusikStueck[] getAlleMusikStueckeNachTitel() {
//		MusikStueck[] ret = new MusikStueck[map.size()]; 
//		map.values().toArray(ret);
//		MusikStueck[] ret = map.values().toArray(new MusikStueck[map.size()]);
		
		MusikStueck[] ret = new MusikStueck[map.size()];
		int i = 0;
		for(MusikStueck m : map.values()) {
			ret[i++] = m;
		}
		Arrays.sort(ret, new VergleicheMusikStueckTitel());
		return ret;
	}
}

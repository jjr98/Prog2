package de.fhws.roemischj.Prog2.klausuruebungen.e;

import java.util.HashMap;

public class Morse {
	public static String[][] tabelle = {
			{ "A", ".−"},
			{ "B", "−..."},
			{ "C", "−.-."},
			{ "D", "-.."},
			{ "E", "."},
			{ "F", "..-."},
			{ "G", "--."},
			{ "H", "...."},
			{ "I", ".."},
			{ "J", ".---"},
			{ "K", "_._"},
			{ "L", ".-.."},
			{ "M", "--"},
			{ "N", "-."},
			{ "O", "---"},
			{ "P", ".--."},
			{ "Q", "--.-"},
			{ "R", ".-."},
			{ "S", "..."},
			{ "T", "-"},
			{ "U", "..-"},
			{ "V", "...-"},
			{ "W", ".--"},
			{ "X", "-..-"},
			{ "Y", "-.--"},
			{ "Z", "--.."}
	};

	public static HashMap<String, String> getMorseCodeMap(String[][] table) {
		HashMap<String, String> map = new HashMap<>();
		for(String[] eintrag : table) {
			map.put(eintrag[0], eintrag[1]);
		}
		return map;
	}
	public static String zeichenketteToMorse(String s) {
		String ret = "";
		HashMap<String,String> map = getMorseCodeMap(tabelle);
		for(char c : s.toUpperCase().toCharArray()) {
			ret += map.get(Character.toString(c)) + " ";
		}
		return ret;
	}

	public static void main(String[] args) {
		HashMap<String,String> map = getMorseCodeMap(tabelle);
		String erg = zeichenketteToMorse("Klausurerfolg");
		System.out.println(erg);
	}
}
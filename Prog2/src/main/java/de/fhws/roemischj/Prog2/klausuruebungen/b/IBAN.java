package de.fhws.roemischj.Prog2.klausuruebungen.b;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IBAN {
	
	public static boolean ibanCheck(String iban) throws FalscheIBANException {
		if(iban.length() < 22) throw new FalscheIBANException("IBAN zu kurz: " + iban);
		if(iban.length() > 22) throw new FalscheIBANException("IBAN zu lang: " + iban);
		for(int i=0; i<2; i++) {
			char c = iban.charAt(i);
			if (c < 'A' || c > 'Z')
				throw new FalscheIBANException("Kein gültiger Ländercode: " + iban);
		}
		return true;
	}
	
	public static void ibanAusDateiLesen(String dateiname) throws FalscheIBANException {
		try(FileReader fr = new FileReader(dateiname);
				BufferedReader br = new BufferedReader(fr)){
			while(true) {
				String iban = br.readLine();
				if(iban == null) break;
				ibanCheck(iban);
			}
			System.out.println("Alles Ok");
		} catch(FileNotFoundException e) {
			System.out.println("Datei " + dateiname + " nicht gefunden.");
		} catch(IOException e) {
			System.out.println("Fehler beim Lesevorgang von Datei: " + dateiname);
		} catch(NullPointerException e) {
			System.out.println("Datei " + dateiname + " existiert nicht.");
		}
	}
	
	public static void dateienTest(String[] dateinamen) {
		for(String dateiname : dateinamen) {
			try {
				ibanAusDateiLesen(dateiname);
			} catch (FalscheIBANException e) {
				System.out.println(dateiname);
			}
		}
	}
	
	public static void main(String[] args) throws FalscheIBANException {
		ibanAusDateiLesen("IBANs.txt");
	}
}

package de.fhws.roemischj.Prog2.klausuruebungen.f;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Mitarbeiter implements Serializable {
	private String vorname = null;
	private String nachname = null;
	private int nummer = 0;
	private transient int gehalt = 0;
	private static transient HashSet<Mitarbeiter> mitarbeiterSet = new HashSet<>(); 

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) {
		Mitarbeiter m1 = new Mitarbeiter("Max", "Mustermann", 5, 1000);
		Mitarbeiter m2 = new Mitarbeiter("John", "Doe", 45, 2000);
		Mitarbeiter m3 = new Mitarbeiter("Jane", "Doe", 61, 3000);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mitarbeiter.dat"))) {
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(m3);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mitarbeiter.dat"))) {
			while (true) {
				Mitarbeiter temp = (Mitarbeiter)ois.readObject();
				mitarbeiterSet.add(temp);
			}
		} catch(EOFException e) {
			
		} catch(IOException e) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Mitarbeiter ma : mitarbeiterSet)
			System.out.println(ma.toString());
	}

	public Mitarbeiter[] sortiere(Collection<Mitarbeiter> team) {
		Mitarbeiter[] maa = (Mitarbeiter[]) team.toArray();
		Comparator<Mitarbeiter> comp = new VergleichePersonalNummer();
		Arrays.sort(maa, comp);
		return maa;
	}
	
	public Mitarbeiter(String vorname, String nachname, int nummer, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.nummer = nummer;
		this.gehalt = gehalt;
	}// endconstructor
		// . . . alle getter- und setter-Methoden
	public int getNummer() {
		return nummer;
	}

	public String toString() {
		return "Nachname: " + nachname + " Vorname: " + vorname + " Personalnummer: " + nummer + " Gehalt: " + gehalt;
	}// endmethod toString

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		return result;
	}// endmethod hashcode

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Mitarbeiter)) {
			return false;
		}
		Mitarbeiter other = (Mitarbeiter) obj;
		if (gehalt != other.gehalt) {
			return false;
		}
	}// endmethod equals
}// endclass Mitarbeiter
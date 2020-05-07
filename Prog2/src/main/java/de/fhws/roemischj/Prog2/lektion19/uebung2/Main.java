package de.fhws.roemischj.Prog2.lektion19.uebung2;

public class Main {

	public static void main(String[] args) {
		StackImpl<String> s = new StackImpl<>();
		s.push("Hallo");
		s.push("Welt");
		System.out.println(s.pop());
		System.out.println(s.pop());
		}
}

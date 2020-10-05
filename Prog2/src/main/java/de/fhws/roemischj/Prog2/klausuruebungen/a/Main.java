package de.fhws.roemischj.Prog2.klausuruebungen.a;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		User u1 = new User("Max", "Musterpw");
		User u2 = new User("Anna", "Masterpw");
		List<User> l = new ArrayList<User>();
		l.add(u1);
		l.add(u2);
		
		UserManager um = new UserManager();
		um.serialize(l);
		List<User> l2 = um.deserialize();
		
		
		for (User user : l2) {
			System.out.println(user.name);
		}
	}
}

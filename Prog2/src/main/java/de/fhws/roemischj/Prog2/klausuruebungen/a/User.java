package de.fhws.roemischj.Prog2.klausuruebungen.a;

import java.io.Serializable;

public class User implements Serializable, Comparable<User>{
	
	private static final long serialVersionUID = 1929662893608961025L;
	
	public final String name;
	public transient final String password;	
	
	public User(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	public int compareTo(User otherUser) {
		return name.compareTo(otherUser.name);
	}
	
}

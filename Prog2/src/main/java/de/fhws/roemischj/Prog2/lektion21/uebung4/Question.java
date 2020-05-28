package de.fhws.roemischj.Prog2.lektion21.uebung4;

public class Question {

	String text; //Fragentext

	private Question(String text)
	{
		this.text = text;
	}
	
	//Wandelt eine eingelesene Zeile in ein Question-Objekt um
	public static Question toQuestion(String line) 
	{
		return new Question(line);
	}
	
	
}
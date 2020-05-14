package de.fhws.roemischj.Prog2.lektion20.uebung3;

import java.util.*;

public class Vokabeltrainer
{
	MultiMap<String, String> english2German = new MultiMap<>();
	String wordToGuess;

	public String getWordToGuess() 
	{
		return wordToGuess;
	}

	public static void main(String[] args)
	{
		Vokabeltrainer guessingGame = new Vokabeltrainer();
		guessingGame.addToDictionary("to clean", "reinigen", "säubern", "putzen");
		guessingGame.addToDictionary("to expand", "vergrößern", "wachsen");
		guessingGame.createRandomWordToGuess();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Was heißt \"" + guessingGame.getWordToGuess() + "\" auf Deutsch?");
		String guess = scanner.nextLine();
		boolean correct = guessingGame.guess(guess);
		if (correct) System.out.println("Korrekt!");
		else System.out.println("Leider falsch!");
		scanner.close();
	}


	public void addToDictionary(String englishWord, String ... germanWords)
	{
		english2German.put(englishWord, germanWords);
	}

	public void createRandomWordToGuess()
	{
		Set<String> keySet = english2German.keySet();
		int randomIndex = (int)(Math.random()*keySet.size());
		Iterator<String> iterator = keySet.iterator();
		int i = 0;
		while(iterator.hasNext())
		{
			String word = iterator.next();
			if (i == randomIndex)
			{
				wordToGuess = word;
				return;
			}i
			++;
		}
	}

	public boolean guess(String guess)
	{
		Set<String> solution = english2German.get(wordToGuess);
		if (solution.contains(guess))
			return true;
		return false;
	}
}

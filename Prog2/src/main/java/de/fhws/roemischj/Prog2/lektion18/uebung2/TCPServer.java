package de.fhws.roemischj.Prog2.lektion18.uebung2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServer {

	public static void main(String[] args) {
		final int PORT = 5000;
		try (ServerSocket ss = new ServerSocket(PORT);
				Socket connection = ss.accept();
				InputStream is = connection.getInputStream();
				OutputStream os = connection.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os)))
		{
			System.out.println("Server gestartet");
			String[] words = { "Programmiersprache", "Informatik", "Java", "Klausur", "Basketball", "Bücher", "Musik", "Hackathon", "Surface",
						"Technik", "Technology", "Hangman", "Aufgabe", "Methode", "String", "Character", "Datentyp", "Klassen",
						"Diagramm" };
			char[] soughtWord = words[(int) (Math.random() * words.length)].toUpperCase().toCharArray();
			char[] guessedWord = new char[soughtWord.length];
			Arrays.fill(guessedWord, '_');
			bw.write(String.valueOf(guessedWord) + "\n");
			bw.flush();
			
			int versuche = 15;
			for (int i = 0; i < versuche; i++) {
				char guessedChar = br.readLine().toUpperCase().charAt(0);
				if(guessedChar != ' ') {
					bw.write("OK");
					bw.flush();
				}
				for (int j = 0; j < soughtWord.length; j++) {
					if(soughtWord[j] == guessedChar)
						guessedWord[j] = guessedChar;
				}
				if(!String.valueOf(guessedWord).contains("_")) {
					bw.write("gewonnen");
					bw.flush();
					bw.write("Wort erraten: " + String.valueOf(soughtWord));
					break;
				}
				else if(i == versuche-1) {
					bw.write("verloren");
					bw.flush();
					bw.write("Wort NICHT erraten: " + String.valueOf(soughtWord));
				}
				else {
					bw.write(String.valueOf(guessedWord));
				}
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

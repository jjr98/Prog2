package de.fhws.roemischj.Prog2.klausuruebungen.d;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Finder {
	public BufferedReader getSystemInAsBufferedReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	public void findStringInFiles(String searchString,
			String[] filenames) {
		for(String filename : filenames) {
			try(LineNumberReader br = new LineNumberReader(new FileReader(filename))) {
//				int linecounter = 1;
				while(true) {
					String line = br.readLine();
					if(line == null) break;
					if(line.contains(searchString))
						System.out.println(filename + ", " + br.getLineNumber());
//					linecounter++;
				}
			} 
			catch(FileNotFoundException e) {
				System.out.println("Datei " + filename + " nicht gefunden");
			}
			catch(IOException e) {
				System.out.println("Datei " + filename + " nicht lesbar");
			}
		}
	}
	public static void main(String[] args)
	{
		Finder finder = new Finder();
		BufferedReader br = finder.getSystemInAsBufferedReader();
		String searchString = null;
		try {
			searchString = br.readLine();
			finder.findStringInFiles(searchString, args);
			br.close();
		} catch (IOException ex) {
			System.out.println("Einlesen fehlgeschlagen.");
		};
	}
}
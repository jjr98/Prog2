package de.fhws.roemischj.Prog2.lektion18.uebung1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudiengangsSplitter {
	
	// Der BufferedReader eignet sich gut, um zeilenweise zu lesen
	
	public static void splitStudiengaenge(String dateiname) {
		try(BufferedReader br = new BufferedReader(new FileReader(dateiname));
				BufferedWriter fwWInf = new BufferedWriter(new FileWriter("WInfNr.txt"));
				BufferedWriter fwInf = new BufferedWriter(new FileWriter("InfNr.txt"));
				BufferedWriter fwEC = new BufferedWriter(new FileWriter("ECNr.txt"))){
			while(true){
				String line = br.readLine();
				if(line == null) break;
				int value;
				try
				{
					value = Integer.parseInt(line);
				} catch(Exception e){
					throw new MatrikelNummerException();
				}
				
				if(value >= 5000000 && value <= 5099999)
					fwWInf.write(line + "\n");
				else if(value >= 5100000 && value <= 5199999)
					fwInf.write(line + "\n");
				else if(value >= 6100000 && value <= 6199999)
					fwEC.write(line + "\n");
				else
					throw new MatrikelNummerException("Ungültige Matrikelnummer: " + line);
			}
			
		}
		catch(IOException e) {
			System.out.println("Datei nicht gefunden");
		}
		catch(MatrikelNummerException me) {
			me.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try{
			splitStudiengaenge("MatrNr.txt");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
